package com.branislav.icpc.Model;

import android.util.Log;

import com.branislav.icpc.MainActivity;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by branislav on 11/5/16.
 */
public class Data {



    public List<Book> DocumentList() {

        List<Book> result = new ArrayList<Book>();

        Book c = new Book();
        c.tile="CPC 00 (R1)";
        c.description = "PRONUNCIAMENTOS";
        c.pdfpath="cpczz.pdf";
        c.flagstring="true";
        result.add(c);


        Book ci = new Book();
        ci.tile="CPC 00 (R1)";
        ci.description = "Estrutura Conceitual para Elaboração e Divulgação de Relatório Contábil-Financeiro";
        ci.pdfpath="cpczz.pdf";
        result.add(ci);

        Book c1 = new Book();
        c1.tile="CPC 01 (R1)";
        c1.description = "Redução ao Valor Recuperável de Ativos";
        c1.pdfpath="cpcone.pdf";
        result.add(c1);

        Book c2 = new Book();
        c2.tile="CPC 02 (R2)";
        c2.description = "Efeitos das mudanças nas taxas de câmbio e conversão de demonstrações contábeis";
        c2.pdfpath="cpctwo.pdf";
        result.add(c2);

        Book c3 = new Book();
        c3.tile="CPC 03 (R2)";
        c3.description = "Demonstração dos Fluxos de Caixa";
        c3.pdfpath="cpcthree.pdf";
        result.add(c3);

        Book c4 = new Book();
        c4.tile="CPC 04 (R1)";
        c4.description = "Ativo Intangível";
        c4.pdfpath="cpcfour.pdf";
        result.add(c4);

        Book c5 = new Book();
        c5.tile="CPC 05 (R1)";
        c5.description = "Divulgação sobre Partes Relacionadas";
        c5.pdfpath="cpcfive.pdf";
        result.add(c5);

        Book c6 = new Book();
        c6.tile="CPC 06 (R1)";
        c6.description = "Operações de Arrendamento Mercantil";
        c6.pdfpath="cpcsix.pdf";
        result.add(c6);

        Book c7 = new Book();
        c7.tile="CPC 07 (R1)";
        c7.description = "Subvenção e Assistência Governamentais";
        c7.pdfpath="cpcseven.pdf";
        result.add(c7);

        Book c8 = new Book();
        c8.tile="CPC 08 (R1)";
        c8.description = "Custos de Transação e Prêmios na Emissão de Títulos e Valores Mobiliários";
        c8.pdfpath="cpceight.pdf";
        result.add(c8);

        Book c9 = new Book();
        c9.tile="CPC 09";
        c9.description = "Demonstração do Valor Adicionado";
        c9.pdfpath="cpcnine.pdf";
        result.add(c9);

        Book c10 = new Book();
        c10.tile="CPC 10 (R1)";
        c10.description = "Pagamento Baseado em Ações";
        c10.pdfpath="cpcten.pdf";
        result.add(c10);

        Book c11 = new Book();
        c11.tile="CPC 11";
        c11.description = "Contratos de Seguro";
        c11.pdfpath="cpceleven.pdf";
        result.add(c11);

        Book c12 = new Book();
        c12.tile="CPC 12";
        c12.description = "Ajuste a Valor Presente";
        c12.pdfpath="cpctwele.pdf";
        result.add(c12);

        Book c13 = new Book();
        c13.tile="CPC 13";
        c13.description = "Adoção Inicial da Lei nº. 11.638/07 e da Medida Provisória nº. 449/08";
        c13.pdfpath="cpcthirten.pdf";
        result.add(c13);

        Book c14 = new Book();
        c14.tile="CPC 15 (R1)";
        c14.description = "Combinação de Negócios";
        c14.pdfpath="cpcfiften.pdf";
        result.add(c14);

        Book c15 = new Book();
        c15.tile="CPC 16 (R1)";
        c15.description = "Estoques";
        c15.pdfpath="cpcsixten.pdf";
        result.add(c15);

        Book c16 = new Book();
        c16.tile="CPC 17 (R1)";
        c16.description = "Contratos de Construção";
        c16.pdfpath="cpcseventen.pdf";
        result.add(c16);

        Book c17 = new Book();
        c17.tile="CPC 18 (R2)";
        c17.description = "Investimento em Coligada e em Controlada";
        c17.pdfpath="cpceighten.pdf";
        result.add(c17);

        Book c18 = new Book();
        c18.tile="CPC 19 (R2)";
        c18.description = "Investimento em Empreendimento Controlado em Conjunto (Joint Venture)";
        c18.pdfpath="cpcninten.pdf";
        result.add(c18);

        Book c19 = new Book();
        c19.tile="CPC 20 (R1)";
        c19.description = "Custos de Empréstimos";
        c19.pdfpath="cpctwenty.pdf";
        result.add(c19);

        Book c20 = new Book();
        c20.tile="CPC 21 (R1)";
        c20.description = "Demonstração Intermediária";
        c20.pdfpath="cpctwentyone.pdf";
        result.add(c20);

        Book c21 = new Book();
        c21.tile="CPC 22";
        c21.description = "Informações por Segmento";
        c21.pdfpath="cpctwentytwo.pdf";
        result.add(c21);

        Book c23 = new Book();
        c23.tile="CPC 23";
        c23.description = "Políticas Contábeis, Mudança de Estimativa e Retificação de Erro";
        c23.pdfpath="cpctwentythree.pdf";
        result.add(c23);

        Book c24 = new Book();
        c24.tile="CPC 24";
        c24.description = "Evento Subsequente";
        c24.pdfpath="cpctwentyfour.pdf";
        result.add(c24);

        Book c25 = new Book();
        c25.tile="CPC 25";
        c25.description = "Provisões, Passivos Contingentes e Ativos Contingentes";
        c25.pdfpath="cpctwentyfive.pdf";
        result.add(c25);

        Book c26 = new Book();
        c26.tile="CPC 26 (R1)";
        c26.description = "Apresentação das Demonstrações Contábeis";
        c26.pdfpath="cpctwentysix.pdf";
        result.add(c26);

        Book c27 = new Book();
        c27.tile="CPC 27";
        c27.description = "Ativo Imobilizado";
        c27.pdfpath="cpctwentyseven.pdf";
        result.add(c27);

        Book c28 = new Book();
        c28.tile="CPC 28";
        c28.description = "Propriedade para Investimento";
        c28.pdfpath="cpctwentyeight.pdf";
        result.add(c28);

        Book c29 = new Book();
        c29.tile="CPC 29";
        c29.description = "Ativo Biológico e Produto Agrícola";
        c29.pdfpath="cpctwentynine.pdf";
        result.add(c29);

        Book c30 = new Book();
        c30.tile="CPC 30 (R1)";
        c30.description = "Receitas";
        c30.pdfpath="cpcthirty.pdf";
        result.add(c30);

        Book c31 = new Book();
        c31.tile="CPC 31";
        c31.description = "Ativo Não Circulante Mantido para Venda e Operação Descontinuada";
        c31.pdfpath="cpcthirtyone.pdf";
        result.add(c31);

        Book c32 = new Book();
        c32.tile="CPC 32";
        c32.description = "Tributos sobre o Lucro";
        c32.pdfpath="cpcthirtytwo.pdf";
        result.add(c32);

        Book c33 = new Book();
        c33.tile="CPC 33 (R1)";
        c33.description = "Benefícios a Empregados";
        c33.pdfpath="cpcthirtythree.pdf";
        result.add(c33);

        Book c34 = new Book();
        c34.tile="CPC 35 (R2)";
        c34.description = "Demonstrações Separadas";
        c34.pdfpath="cpcthirtyfive.pdf";
        result.add(c34);

        Book c35 = new Book();
        c35.tile="CPC 36 (R3)";
        c35.description = "Demonstrações Consolidadas";
        c35.pdfpath="cpcthirtysix.pdf";
        result.add(c35);

        Book c36 = new Book();
        c36.tile="CPC 37 (R1)";
        c36.description = "Adoção Inicial das Normas Internacionais de Contabilidade";
        c36.pdfpath="cpcthirtyseven.pdf";
        result.add(c36);

        Book c37 = new Book();
        c37.tile="CPC 38";
        c37.description = "Instrumentos Financeiros: Reconhecimento e Mensuração";
        c37.pdfpath="cpcthirtyeight.pdf";
        result.add(c37);

        Book c38 = new Book();
        c38.tile="CPC 39";
        c38.description = "Instrumentos Financeiros: Apresentação";
        c38.pdfpath="cpcthirtynine.pdf";
        result.add(c38);

        Book c39 = new Book();
        c39.tile="CPC 40 (R1)";
        c39.description = "Instrumentos Financeiros: Evidenciação";
        c39.pdfpath="cpcfourty.pdf";
        result.add(c39);

        Book c40 = new Book();
        c40.tile="CPC 41";
        c40.description = "Resultado por Ação";
        c40.pdfpath="cpcfourtyone.pdf";
        result.add(c40);

        Book c41 = new Book();
        c41.tile="CPC 43 (R1)";
        c41.description = "Adoção Inicial dos Pronunciamentos Técnicos CPC 15 a 41";
        c41.pdfpath="cpcfourtythree.pdf";
        result.add(c41);

        Book c42 = new Book();
        c42.tile="CPC 45";
        c42.description = "Divulgação de Participações em Outras Entidades";
        c42.pdfpath="cpcfourtyfive.pdf";
        result.add(c42);

        Book c43 = new Book();
        c43.tile="CPC 46";
        c43.description = "Mensuração do Valor Justo";
        c43.pdfpath="cpcfourtysix.pdf";
        result.add(c43);

        Book c44 = new Book();
        c44.tile="CPC PME (R1)";
        c44.description = "Contabilidade para Pequenas e Médias Empresas (R1) (com Glossário de Termos)";
        c44.pdfpath="CPC_PMEeGlossario_R1.pdf";
        result.add(c44);

        Book c45 = new Book();
        c45.tile="H";
        c45.description = "INTERPRETACOES";
        c45.pdfpath="";
        c45.flagstring="true";
        result.add(c45);

        Book c46 = new Book();
        c46.tile="ICPC 01 (R1)";
        c46.description = "Contratos de Concessão";
        c46.pdfpath="icpcone.pdf";
        result.add(c46);

        Book c47= new Book();
        c47.tile="ICPC 02";
        c47.description = "Contrato de Construção do Setor Imobiliário";
        c47.pdfpath="icpctwo.pdf";
        result.add(c47);

        Book c48 = new Book();
        c48.tile="ICPC 03";
        c48.description = "Aspectos Complementares das Operações de Arrendamento Mercantil";
        c48.pdfpath="icpcthree.pdf";
        result.add(c48);

        Book c50 = new Book();
        c50.tile="ICPC 04";
        c50.description = "Alcance do Pronunciamento Técnico CPC 10 - Pagamento Baseado em Ações";
        c50.pdfpath="icpcfour.pdf";
        result.add(c50);

        Book c49 = new Book();
        c49.tile="ICPC 05";
        c49.description = "Pronunciamento Técnico CPC 10 - Pagamento Baseado em Ações - Transações de Ações do Grupo e em Tesouraria";
        c49.pdfpath="icpcfive.pdf";
        result.add(c49);

        Book c51 = new Book();
        c51.tile="ICPC 06";
        c51.description = "Hedge de Investimento Líquido em Operação no Exterior";
        c51.pdfpath="icpcsix.pdf";
        result.add(c51);

        Book c52 = new Book();
        c52.tile="ICPC 07";
        c52.description = "Distribuição de Lucros in Natura";
        c52.pdfpath="icpcseven.pdf";
        result.add(c52);

        Book c53 = new Book();
        c53.tile="ICPC 08 (R1)";
        c53.description = "Contabilização da Proposta de Pagamento de Dividendos";
        c53.pdfpath="icpceight.pdf";
        result.add(c53);

        Book c54 = new Book();
        c54.tile="ICPC 09 (R1)";
        c54.description = "Demonstrações Contábeis Individuais, Demonstrações Separadas, Demonstrações Consolidadas e Aplicação do Método de Equivalência Patrimonial";
        c54.pdfpath="icpcnine.pdf";
        result.add(c54);

        Book c56 = new Book();
        c56.tile="ICPC 10";
        c56.description = "Interpretação sobre a Aplicação Inicial ao Ativo Imobilizado e à Propriedade para Investimento dos Pronunciamentos Técnicos CPCs 27, 28, 37 e 43";
        c56.pdfpath="icpcten.pdf";
        result.add(c56);

        Book c57 = new Book();
        c57.tile="ICPC 11";
        c57.description = "Recebimento em Transferência de Ativos de Clientes";
        c57.pdfpath="icpceleven.pdf";
        result.add(c57);

        Book c58 = new Book();
        c58.tile="ICPC 12";
        c58.description = "Mudanças em Passivos por Desativação, Restauração e Outros Passivos Similares";
        c58.pdfpath="icpctwele.pdf";
        result.add(c58);

        Book c59 = new Book();
        c59.tile="ICPC 13";
        c59.description = "Direitos a Participações Decorrentes de Fundos de Desativação, Restauração e Reabilitação Ambiental";
        c59.pdfpath="icpcthirten.pdf";
        result.add(c59);

        Book c60 = new Book();
        c60.tile="ICPC 14";
        c60.description = "Cotas de Cooperados em Entidades Cooperativas e Instrumentos Similares";
        c60.pdfpath="icpcfourthen.pdf";
        result.add(c60);

        Book c61 = new Book();
        c61.tile="ICPC 15";
        c61.description = "Passivo Decorrente de Participação em um Mercado Específico - Resíduos de Equipamentos Eletroeletrônicos";
        c61.pdfpath="icpcfiften.pdf";
        result.add(c61);

        Book c62 = new Book();
        c62.tile="ICPC 16";
        c62.description = "Extinção de Passivos Financeiros com Instrumentos Patrimoniais";
        c62.pdfpath="icpcsixten.pdf";
        result.add(c62);

        Book c63 = new Book();
        c63.tile="ICPC 17";
        c63.description = "Contratos de Concessão: Evidenciação";
        c63.pdfpath="icpcseventen.pdf";
        result.add(c63);

        Book c64 = new Book();
        c64.tile="ICPC 18";
        c64.description = "Custos de Remoção de Estéril (Stripping) de Mina de Superfície na Fase de Produção";
        c64.pdfpath="icpceighten.pdf";
        result.add(c64);

        Book c65 = new Book();
        c65.tile="ICPC 19";
        c65.description = "Tributos";
        c65.pdfpath="icpcninten.pdf";
        result.add(c65);

        Book c66 = new Book();
        c66.tile="ICPC 20";
        c66.description = "Limite de Ativo de Benefício Definido, Requisitos de Custeio (Funding) Mínimo e sua Interação";
        c66.pdfpath="icpctwenty.pdf";
        result.add(c66);

        Book c67 = new Book();
        c67.tile="H";
        c67.description = "ORIENTACOES";
        c67.pdfpath="";
        c67.flagstring="true";
        result.add(c67);

        Book c68 = new Book();
        c68.tile="OCPC 01 (R1)";
        c68.description = "Entidades de Incorporação Imobiliária";
        c68.pdfpath="ocpcone.pdf";
        result.add(c68);

        Book c69 = new Book();
        c69.tile="OCPC 02";
        c69.description = "Esclarecimentos sobre as Demonstrações Contábeis de 2008";
        c69.pdfpath="ocpctwo.pdf";
        result.add(c69);

        Book c70 = new Book();
        c70.tile="OCPC 03";
        c70.description = "Instrumentos Financeiros: Reconhecimento, Mensuração e Evidenciação";
        c70.pdfpath="ocpcthree.pdf";
        result.add(c70);

        Book c71 = new Book();
        c71.tile="OCPC 04";
        c71.description = "Aplicação da Interpretação Técnica ICPC 02 às Entidades de Incorporação Imobiliária Brasileiras";
        c71.pdfpath="ocpcfour.pdf";
        result.add(c71);

        Book c72 = new Book();
        c72.tile="OCPC 05";
        c72.description = "Contratos de Concessão";
        c72.pdfpath="ocpcfive.pdf";
        result.add(c72);

        Book c73 = new Book();
        c73.tile="OCPC 06";
        c73.description = "Apresentação de Informações Financeiras Pro Forma";
        c73.pdfpath="ocpcsix.pdf";
        result.add(c73);

        Book c74 = new Book();
        c74.tile="OCPC 07";
        c74.description = "Evidenciação na Divulgação dos Relatórios Contábil-Financeiros de Propósito Geral";
        c74.pdfpath="ocpcseven.pdf";
        result.add(c74);

        Book c75 = new Book();
        c75.tile="OCPC 08";
        c75.description = "Reconhecimento de Determinados Ativos e Passivos nos Relatórios Contábil-Financeiros de Propósito Geral das Distribuidoras de Energia Elétrica emitidos de acordo com as Normas Brasileiras e Internacionais de Contabilidade";
        c75.pdfpath="ocpceight.pdf";
        result.add(c75);

        Book c76 = new Book();
        c76.tile="H";
        c76.description = "REVISÕES";
        c76.pdfpath="";
        c76.flagstring="true";
        result.add(c76);

        Book c77 = new Book();
        c77.tile="Revisão ICPC 01";
        c77.description = "REVISÃO DE INTERPRETAÇÕES TÉCNICAS – nº 01";
        c77.pdfpath="devisaozz.pdf";
        result.add(c77);

        Book c78 = new Book();
        c78.tile="Revisão CPC 01";
        c78.description = "REVISÃO CPC Nº. 1 DE PRONUNCIAMENTOS TÉCNICOS E ORIENTAÇÃO TÉCNICA";
        c78.pdfpath="devisaoone.pdf";
        result.add(c78);

        Book c79 = new Book();
        c79.tile="Revisão CPC 02";
        c79.description = "REVISÃO CPC Nº. 2";
        c79.pdfpath="devisaotwo.pdf";
        result.add(c79);

        Book c80 = new Book();
        c80.tile="Revisão CPC 03";
        c80.description = "REVISÃO DE PRONUNCIAMENTOS TÉCNICOS Nº 03";
        c80.pdfpath="devisaothree.pdf";
        result.add(c80);

        Book c81 = new Book();
        c81.tile="Revisão CPC 04";
        c81.description = "REVISÃO DE PRONUNCIAMENTOS TÉCNICOS Nº 04";
        c81.pdfpath="devisaofour.pdf";
        result.add(c81);

        Book c82= new Book();
        c82.tile="Revisão CPC 05";
        c82.description = "REVISÃO DE PRONUNCIAMENTOS TÉCNICOS Nº 05";
        c82.pdfpath="devisaofive.pdf";
        result.add(c82);

        Book c83 = new Book();
        c83.tile="Revisão CPC 06";
        c83.description = "REVISÃO DE PRONUNCIAMENTOS TÉCNICOS – Nº 06/2014";
        c83.pdfpath="devisaosix.pdf";
        result.add(c83);


        Book c84 = new Book();
        c84.tile="Revisão CPC 07";
        c84.description = "REVISÃO DE PRONUNCIAMENTOS TÉCNICOS – Nº 07/2014";
        c84.pdfpath="devisaoseven.pdf";
        result.add(c84);


        Book c85 = new Book();
        c85.tile="Revisão CPC 08";
        c85.description = "REVISÃO DE PRONUNCIAMENTOS TÉCNICOS – Nº 08/2015";
        c85.pdfpath="devisaoeight.pdf";
        result.add(c85);



        return result;
    }
}
