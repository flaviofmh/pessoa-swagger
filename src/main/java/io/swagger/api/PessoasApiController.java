package io.swagger.api;

import io.swagger.model.PessoaRequest;
import io.swagger.model.PessoaResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-03-24T02:48:12.709Z")

@Controller
public class PessoasApiController implements PessoasApi {

    private static final Logger log = LoggerFactory.getLogger(PessoasApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PessoasApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<PessoaResponse> listarPessoas(@NotNull @ApiParam(value = "Numero da pagina da listagem", required = true) @Valid @RequestParam(value = "page", required = true) Long page,@NotNull @ApiParam(value = "Quantidade de dados a ser exibida na pagina", required = true) @Valid @RequestParam(value = "count", required = true) Long count,@ApiParam(value = "") @Valid @RequestParam(value = "nome", required = false) String nome,@ApiParam(value = "") @Valid @RequestParam(value = "cpf", required = false) String cpf,@ApiParam(value = "") @Valid @RequestParam(value = "email", required = false) String email) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<PessoaResponse>(objectMapper.readValue("{  \"foto\" : \"UHhhFFGGIAOiww77GBBKghyjgdftiuOiuionjhbhjvjhf65345jvFYTFVUYGUYIFTUYUYGbhjfgrtds34554\",  \"cpf\" : \"123.456.789-00\",  \"nome\" : \"Jonas Santos\",  \"dataNascimento\" : \"\",  \"email\" : \"email@email.com\"}", PessoaResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<PessoaResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<PessoaResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<PessoaRequest> salvarPessoa(@ApiParam(value = ""  )  @Valid @RequestBody PessoaRequest pessoa) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<PessoaRequest>(objectMapper.readValue("{  \"foto\" : \"UHhhFFGGIAOiww77GBBKghyjgdftiuOiuionjhbhjvjhf65345jvFYTFVUYGUYIFTUYUYGbhjfgrtds34554\",  \"cpf\" : \"123.456.789-00\",  \"nome\" : \"Jonas Santos\",  \"id\" : 123,  \"dataNascimento\" : \"\",  \"email\" : \"email@email.com\"}", PessoaRequest.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<PessoaRequest>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<PessoaRequest>(HttpStatus.NOT_IMPLEMENTED);
    }

}
