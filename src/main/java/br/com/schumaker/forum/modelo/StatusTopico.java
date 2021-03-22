package br.com.schumaker.forum.modelo;

public enum StatusTopico {

    NAO_RESPONDIDO {
		@Override
		public StatusTopico getNextStatus() {
			return NAO_SOLUCIONADO;
		}
	},
    NAO_SOLUCIONADO{
		@Override
		public getNextStatus() {
			return SOLUCIONADO;
		}
	},
    SOLUCIONADO {
		@Override
		public StatusTopico getNextStatus() {
			return FECHADO;
		}
	},
    FECHADO {
		@Override
		public StatusTopico getNextStatus() {
			return FECHADO;
		}
	};
    
    public abstract getNextStatus();
}
