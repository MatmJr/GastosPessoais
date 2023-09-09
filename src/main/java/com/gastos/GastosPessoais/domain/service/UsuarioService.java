package com.gastos.GastosPessoais.domain.service;

import com.gastos.GastosPessoais.domain.model.Usuario;
import com.gastos.GastosPessoais.domain.repository.UsuarioRepository;
import com.gastos.GastosPessoais.dto.usuario.UsuarioRequestDto;
import com.gastos.GastosPessoais.dto.usuario.UsuarioResponseDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class UsuarioService implements ICRUDService<UsuarioRequestDto, UsuarioResponseDto> {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private ModelMapper mapper;

    /**
     * @return
     */
    @Override
    public List<UsuarioResponseDto> obterTodos() {

        List<Usuario> usuarios = usuarioRepository.findAll();

        //List<UsuarioResponseDto> usuariosDto = new ArrayList<>();

        //for (Usuario usuario : usuarios){
        //    usuariosDto.add(mapper.map(usuario, UsuarioResponseDto.class));
        //}
        //return usuariosDto;
        return usuarios.stream().map(usuario -> mapper.map(usuario, UsuarioResponseDto.class))
                .collect(Collectors.toList());
    }

    /**
     * @param id
     * @return
     */
    @Override
    public UsuarioResponseDto obterPorId(Long id) {
        Optional<Usuario> optionalUsuario = usuarioRepository.findById(id);

        if(optionalUsuario.isEmpty()){
            // lançar exception
        }
        return mapper.map(optionalUsuario.get(), UsuarioResponseDto.class);
    }

    /**
     * @param dto
     * @return
     */
    @Override
    public UsuarioResponseDto cadastrar(UsuarioRequestDto dto) {
        return null;
    }

    /**
     * @param id
     * @param dto
     * @return
     */
    @Override
    public UsuarioResponseDto atualizar(Long id, UsuarioRequestDto dto) {
        return null;
    }

    /**
     * @param id
     */
    @Override
    public void deletar(Long id) {

    }
}
