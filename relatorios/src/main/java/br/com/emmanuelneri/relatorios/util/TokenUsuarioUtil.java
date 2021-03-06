package br.com.emmanuelneri.relatorios.util;

import br.com.emmanuelneri.relatorios.model.Modulo;
import br.com.emmanuelneri.relatorios.model.Usuario;
import com.auth0.jwt.JWTSigner;

import java.util.HashMap;
import java.util.Map;

public final class TokenUsuarioUtil {

    public static String createToken(Usuario usuarioMenu, Modulo moduloMenu) {
        final Map<String, Object> mapValores = new HashMap<>();
        mapValores.put("email", usuarioMenu.getEmail());
        mapValores.put("id", usuarioMenu.getId());
        mapValores.put("nome", usuarioMenu.getNome());
        mapValores.put("chaveAplicacao", moduloMenu.getChave());

        return new JWTSigner("secret").sign(mapValores);
    }

}
