package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PessoaResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-03-24T02:48:12.709Z")

public class PessoaResponse   {
  @JsonProperty("nome")
  private String nome = null;

  @JsonProperty("cpf")
  private String cpf = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("foto")
  private String foto = null;

  @JsonProperty("dataNascimento")
  private String dataNascimento = null;

  public PessoaResponse nome(String nome) {
    this.nome = nome;
    return this;
  }

  /**
   * Get nome
   * @return nome
  **/
  @ApiModelProperty(example = "Jonas Santos", value = "")


  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public PessoaResponse cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }

  /**
   * Get cpf
   * @return cpf
  **/
  @ApiModelProperty(example = "123.456.789-00", value = "")

@Size(min=14,max=14) 
  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public PessoaResponse email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(example = "email@email.com", value = "")

@Size(max=140) 
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public PessoaResponse foto(String foto) {
    this.foto = foto;
    return this;
  }

  /**
   * Get foto
   * @return foto
  **/
  @ApiModelProperty(example = "UHhhFFGGIAOiww77GBBKghyjgdftiuOiuionjhbhjvjhf65345jvFYTFVUYGUYIFTUYUYGbhjfgrtds34554", value = "")


  public String getFoto() {
    return foto;
  }

  public void setFoto(String foto) {
    this.foto = foto;
  }

  public PessoaResponse dataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
    return this;
  }

  /**
   * Get dataNascimento
   * @return dataNascimento
  **/
  @ApiModelProperty(example = "", value = "")


  public String getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PessoaResponse pessoaResponse = (PessoaResponse) o;
    return Objects.equals(this.nome, pessoaResponse.nome) &&
        Objects.equals(this.cpf, pessoaResponse.cpf) &&
        Objects.equals(this.email, pessoaResponse.email) &&
        Objects.equals(this.foto, pessoaResponse.foto) &&
        Objects.equals(this.dataNascimento, pessoaResponse.dataNascimento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, cpf, email, foto, dataNascimento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PessoaResponse {\n");
    
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    foto: ").append(toIndentedString(foto)).append("\n");
    sb.append("    dataNascimento: ").append(toIndentedString(dataNascimento)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

