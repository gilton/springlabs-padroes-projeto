package br.com.dio.springlabsgof.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Endereco {

	@Id
	private String cep;
	private String logradouro;
	private String complemento;
	private String bairro;
	private String localidade;
	private String uf;
	private String ibge;
	private String gia;
	private String ddd;
	private String siafi;

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getIbge() {
		return ibge;
	}

	public void setIbge(String ibge) {
		this.ibge = ibge;
	}

	public String getGia() {
		return gia;
	}

	public void setGia(String gia) {
		this.gia = gia;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getSiafi() {
		return siafi;
	}

	public void setSiafi(String siafi) {
		this.siafi = siafi;
	}
	
	// Builder Class
	public static class Builder {
        private Endereco endereco;

        public Builder() {
            endereco = new Endereco();
        }

        public Builder cep(String cep) {
            endereco.cep = cep;
            return this;
        }

        public Builder logradouro(String logradouro) {
            endereco.logradouro = logradouro;
            return this;
        }

        public Builder complemento(String complemento) {
            endereco.complemento = complemento;
            return this;
        }

        public Builder bairro(String bairro) {
            endereco.bairro = bairro;
            return this;
        }

        public Builder localidade(String localidade) {
            endereco.localidade = localidade;
            return this;
        }

        public Builder uf(String uf) {
            endereco.uf = uf;
            return this;
        }

        public Builder ibge(String ibge) {
            endereco.ibge = ibge;
            return this;
        }

        public Builder gia(String gia) {
            endereco.gia = gia;
            return this;
        }

        public Builder ddd(String ddd) {
            endereco.ddd = ddd;
            return this;
        }

        public Builder siafi(String siafi) {
            endereco.siafi = siafi;
            return this;
        }

        public Endereco build() {
            return endereco;
        }
    }

}
