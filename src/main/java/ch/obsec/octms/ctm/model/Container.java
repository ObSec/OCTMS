package ch.obsec.octms.ctm.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @version 1.0
 * @since 1.0
 * @author mario.oberli@obsec.ch
 */
public class Container {

	private static final Logger LOGGER = LoggerFactory.getLogger(Container.class);

	private String containerID;
	private TEU containerTEU;
	private String containerSource;
	private String containerDestination;
	private String containerLocation;

	/**
	 * getContainerID
	 * @return containerID get ID of the container
	 */
	public String getContainerID() {
		LOGGER.debug("getContainerID(): {}",containerID);
		return containerID;
	}

	/**
	 * setContainerID
	 * @param containerID set ID of the container
	 */
	public void setContainerID(String containerID) {
		LOGGER.debug("setContainerID({})",containerID);
		this.containerID = containerID;
	}

	/**
	 * getContainerType
	 * @return containerTEU get TEU of the container
	 */
	public String getContainerTEU() {
		LOGGER.debug("getContainerType(): {}",containerTEU);
		return containerTEU.name();
	}

	/**
	 * setContainerType
	 * @param containerTEU set TEU of the container
	 */
	public void setContainerTEU(TEU containerTEU) {
		LOGGER.debug("setContainerType({})",containerTEU);
		this.containerTEU = containerTEU;
	}

	/**
	 * getContainerSource
	 * @return containerType get Source of the container
	 */
	public String getContainerSource() {
		LOGGER.debug("getContainerSource(): {}",containerSource);
		return containerSource;
	}

	/**
	 * setContainerSource
	 * @param containerSource set Source of the container
	 */
	public void setContainerSource(String containerSource) {
		LOGGER.debug("setContainerSource({})",containerSource);
		this.containerSource = containerSource;
	}

	/**
	 * getContainerDestination
	 * @return containerDestination set Destination of the container
	 */
	public String getContainerDestination() {
		LOGGER.debug("getContainerDestination(): {}",containerDestination);
		return containerDestination;
	}

	/**
	 * setContainerDestination
	 * @param containerDestination set Destination of the container
	 */
	public void setContainerDestination(String containerDestination) {
		LOGGER.debug("setContainerDestination({})",containerDestination);
		this.containerDestination = containerDestination;
	}

	/**
	 * getContainerLocation
	 * @return containerLocation  get Location of the container
	 */
	public String getContainerLocation() {
		LOGGER.debug("getContainerLocation(): {}",containerLocation);
		return containerLocation;
	}

	/**
	 * setContainerLocation
	 * @param containerLocation set Location of the container
	 */
	public void setContainerLocation(String containerLocation) {
		LOGGER.debug("setContainerLocation({})",containerLocation);
		this.containerLocation = containerLocation;
	}

	/**
	 * toString
	 */
	@Override
	public String toString() {
		return "Container: " + containerID + " TEU: " + containerTEU + " Src: " + containerSource + " Dest: " + containerDestination;
	}
}
