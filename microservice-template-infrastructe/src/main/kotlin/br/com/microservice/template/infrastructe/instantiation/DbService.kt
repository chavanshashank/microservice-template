package br.com.microservice.template.infrastructe.instantiation

import org.springframework.stereotype.Service
import java.text.ParseException

/**
 * Created by JoaoPedroCardoso on 23/05/18
 */

@Service
class DbService {

    /*@Autowired
	private BCryptPasswordEncoder pe;
	@Autowired
	private RachaRepository racharepository;
	@Autowired
	private UsuarioRepository usuariorepository;
	@Autowired
	private EnderecoRepository enderecorepository;
	@Autowired
	private CoordenadaRepository coordenadarepository;
	@Autowired
	private QuadraRepository quadrarepository;
	@Autowired
	private PagamentoRepository pagamentorepository;
	@Autowired
	private HorarioRepository horariorepository;
    */
    @Throws(ParseException::class)
    fun instantiateTestDatabase() {

        /*Pagamento pag1 = new PagamentoViaTransferencia(null, 1, "123456", "0129834");
		Pagamento pag2 = new PagamentoViaTransferencia(null, 2, "789102", "789102");
		Pagamento pag3 = new PagamentoComCartao(null, 2, "Joao Cardoso", "4916736161899434", "102", "16/04/2019");

		Horario horario1 = new Horario(null, "06:00", "07:00");
		Horario horario2 = new Horario(null, "07:00", "08:00");
		Horario horario3 = new Horario(null, "08:00", "09:00");
		Horario horario4 = new Horario(null, "09:00", "10:00");
		Horario horario5 = new Horario(null, "10:00", "11:00");
		Horario horario6 = new Horario(null, "11:00", "12:00");
		Horario horario7 = new Horario(null, "12:00", "13:00");
		Horario horario8 = new Horario(null, "13:00", "14:00");
		Horario horario9 = new Horario(null, "14:00", "15:00");
		Horario horario10 = new Horario(null, "15:00", "16:00");
		Horario horario11 = new Horario(null, "16:00", "17:00");
		Horario horario12 = new Horario(null, "17:00", "18:00");
		Horario horario13 = new Horario(null, "18:00", "19:00");
		Horario horario14 = new Horario(null, "19:00", "20:00");
		Horario horario15 = new Horario(null, "20:00", "21:00");
		Horario horario16 = new Horario(null, "21:00", "22:00");
		Horario horario17 = new Horario(null, "22:00", "23:00");
		Horario horario18 = new Horario(null, "23:00", "00:00");

		Coordenada coor1 = new Coordenada(null, "-18.9330043", "-48.2802234");
		Coordenada coor2 = new Coordenada(null, "-18.9315485", "-48.2798621");
		Coordenada coor3 = new Coordenada(null, "-18.9328282", "-48.2824738");
		Coordenada coor4 = new Coordenada(null, "-18.9327115", "-48.2781823");
		Coordenada coor5 = new Coordenada(null, "-18.936392", "-48.2740954");
		Coordenada coor6 = new Coordenada(null, "-18.9347498", "-48.2755671");

		Endereco end1 = new Endereco(null, "Rua endereco 1", 10, "Bloco 13 Ap101", "Uberlândia","Santa Monica", "Minas Gerais",
				"123456789", coor1);
		Endereco end2 = new Endereco(null, "Rua endereco 2", 232, "Ap201", "Uberlândia", "Santa Monica","Minas Gerais",
				"123456789", coor2);
		Endereco end3 = new Endereco(null, "Av. endereco 3", 100, "Bloco 01 Ap202", "Uberlândia", "Segismundo Pereira","Minas Gerais",
				"123456789", coor3);
		Endereco end4 = new Endereco(null, "Av. endereco 4", 1290, "Bloco 10 AP101", "Uberlândia","Martins", "Minas Gerais",
				"123456789", coor4);
		Endereco end5 = new Endereco(null, "Rua endereco 5", 51, "Antiga 18", "Uberlândia", "Planalto", "Minas Gerais",
				"123456789", coor5);
		Endereco end6 = new Endereco(null, "Rua endereco 6", 12, "Antiga 20", "Uberlândia","Santa Monica", "Minas Gerais",
				"123456789", coor6);


		Quadra quadra = new Quadra(null, "quadra do carioca", "3432109871", 1, "obs quadra teste", end1);
		Quadra quadra1 = new Quadra(null, "quadra do seu joao", "3432189210", 2, "obs quadra do seu joao", end2);
		Quadra quadra2 = new Quadra(null, "quadra ze do fute", "3432178312", 3, "obs quadra ze do fute", end3);
		Quadra quadra3 = new Quadra(null, "quadra raxinha", "3432233210", 4, "obs quadra raxinha", end4);
		Quadra quadra4 = new Quadra(null, "quadra do luiz", "3432908711", 5, "obs quadra do luiz", end5);
		Quadra quadra5 = new Quadra(null, "quadra fernandes", "3432564910", 2, "obs quadra fernandes", end6);

		Usuario usu1 = new Usuario(null, "Leonardo", "123456789", "leocm", pe.encode("123456"));
		Usuario usu2 = new Usuario(null, "JoaoPedro", "98765431", "joaop", pe.encode("123456"));
		Usuario usu3 = new Usuario(null, "Victor", "1010101034", "vict", pe.encode("123456"));
		usu3.addPerfil(Perfil.ADMIN);

		Racha racha1 = new Racha(null, horario1, quadra, usu1, 1, pag1,"01/11/2017");
		Racha racha2 = new Racha(null, horario2, quadra1, usu2, 2,pag1,"10/11/2017");
		Racha racha3 = new Racha(null, horario1, quadra3, usu3, 1,pag2,"01/11/2017");
		Racha racha4 = new Racha(null, horario3, quadra2, usu3, 2,pag3,"01/11/2017");
		Racha racha5 = new Racha(null, horario1, quadra2, usu3, 2,pag3,"20/11/2017");

		coordenadarepository.save(Arrays.asList(coor1,coor2,coor3,coor4,coor5,coor6));
		enderecorepository.save(Arrays.asList(end1,end2,end3,end4,end5,end6));
		quadrarepository.save(Arrays.asList(quadra,quadra1,quadra2,quadra3,quadra4,quadra5));
		pagamentorepository.save(Arrays.asList(pag1,pag2,pag3));
		horariorepository.save(Arrays.asList(horario1,horario2,horario3,horario4,horario5,horario6,horario7,horario8,horario9,horario10
				,horario11,horario12,horario13,horario14,horario15,horario16,horario17,horario18));
		usuariorepository.save(Arrays.asList(usu1, usu2,usu3));
		racharepository.save(Arrays.asList(racha1,racha2,racha3,racha4, racha5));*/
    }
}
