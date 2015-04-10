package ch.obsec.octms.ctm;

import ch.obsec.octms.ctm.model.Container;
import ch.obsec.octms.ctm.model.TEU;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @version 1.0
 * @since 1.0
 * @author mario.oberli@obsec.ch
 */
public class ContainerTerminal {

	private static final Logger LOGGER = LoggerFactory.getLogger(Container.class);

	public static void main(String[] args) {
		LOGGER.debug("main()");
		System.out.println("CTM");

		Container c000001 = new Container();
		c000001.setContainerID("000001");
		c000001.setContainerTEU(TEU.FORTY);
		c000001.setContainerSource("Zurich");
		c000001.setContainerDestination("Basel");
		c000001.setContainerLocation("Merenschwand");

		System.out.println(c000001.toString());

	}

}
