package com.evie.utility.domain

import org.springframework.data.annotation.Id

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlEnum
import javax.xml.bind.annotation.XmlRootElement
import javax.xml.bind.annotation.XmlTransient

/**
 * Created by rmhedge on 12/6/15.
 * All mongo size values are translated to bytes for consistency
 */
@XmlAccessorType( XmlAccessType.FIELD )
@XmlRootElement
class MongostatRecord extends MonitoringRecord {

    @XmlEnum
    public enum ReplicationStatus {PRIMARY,SECONDARY,RECOVERING,UNKNOWN,ROUTER,ARBITER};

    @XmlTransient
    @Id
    private String id;

    private String host
    private int num;

    private int numberInserts;
    private int numberQueries;
    private int numberUpdates;
    private int numberDeletes;
    private int numberGetmore;
    private int numberCommands;
    private int numberFlushes;

    private double percentageDirty;
    private double percentageCacheInUse;
    private int virtualMemorySize;
    private int residentMegabytes;

    private int queuedReads;
    private int queuedWrires;
    private int activeClientsReading;
    private int activeClientsWriting;

    private int networkTrafficIn;
    private int networkTrafficOut;
    private int numberConnections;
    private String replicaSetName;
    private ReplicationStatus replicationStaus;

    String getHost() {
        return host
    }

    void setHost(String host) {
        this.host = host
    }

    int getNum() {
        return num
    }

    void setNum(int num) {
        this.num = num
    }

    int getNumberInserts() {
        return numberInserts
    }

    void setNumberInserts(int numberInserts) {
        this.numberInserts = numberInserts
    }

    int getNumberQueries() {
        return numberQueries
    }

    void setNumberQueries(int numberQueries) {
        this.numberQueries = numberQueries
    }

    int getNumberUpdates() {
        return numberUpdates
    }

    void setNumberUpdates(int numberUpdates) {
        this.numberUpdates = numberUpdates
    }

    int getNumberDeletes() {
        return numberDeletes
    }

    void setNumberDeletes(int numberDeletes) {
        this.numberDeletes = numberDeletes
    }

    int getNumberGetmore() {
        return numberGetmore
    }

    void setNumberGetmore(int numberGetmore) {
        this.numberGetmore = numberGetmore
    }

    int getNumberCommands() {
        return numberCommands
    }

    void setNumberCommands(int numberCommands) {
        this.numberCommands = numberCommands
    }

    int getNumberFlushes() {
        return numberFlushes
    }

    void setNumberFlushes(int numberFlushes) {
        this.numberFlushes = numberFlushes
    }

    double getPercentageDirty() {
        return percentageDirty
    }

    void setPercentageDirty(double percentageDirty) {
        this.percentageDirty = percentageDirty
    }

    double getPercentageCacheInUse() {
        return percentageCacheInUse
    }

    void setPercentageCacheInUse(double percentageCacheInUse) {
        this.percentageCacheInUse = percentageCacheInUse
    }

    int getVirtualMemorySize() {
        return virtualMemorySize
    }

    void setVirtualMemorySize(int virtualMemorySize) {
        this.virtualMemorySize = virtualMemorySize
    }

    int getResidentMegabytes() {
        return residentMegabytes
    }

    void setResidentMegabytes(int residentMegabytes) {
        this.residentMegabytes = residentMegabytes
    }

    int getQueuedReads() {
        return queuedReads
    }

    void setQueuedReads(int queuedReads) {
        this.queuedReads = queuedReads
    }

    int getQueuedWrires() {
        return queuedWrires
    }

    void setQueuedWrires(int queuedWrires) {
        this.queuedWrires = queuedWrires
    }

    int getActiveClientsReading() {
        return activeClientsReading
    }

    void setActiveClientsReading(int activeClientsReading) {
        this.activeClientsReading = activeClientsReading
    }

    int getActiveClientsWriting() {
        return activeClientsWriting
    }

    void setActiveClientsWriting(int activeClientsWriting) {
        this.activeClientsWriting = activeClientsWriting
    }

    int getNetworkTrafficIn() {
        return networkTrafficIn
    }

    void setNetworkTrafficIn(int networkTrafficIn) {
        this.networkTrafficIn = networkTrafficIn
    }

    int getNetworkTrafficOut() {
        return networkTrafficOut
    }

    void setNetworkTrafficOut(int networkTrafficOut) {
        this.networkTrafficOut = networkTrafficOut
    }

    int getNumberConnections() {
        return numberConnections
    }

    void setNumberConnections(int numberConnections) {
        this.numberConnections = numberConnections
    }

    String getReplicaSetName() {
        return replicaSetName
    }

    void setReplicaSetName(String replicaSetName) {
        this.replicaSetName = replicaSetName
    }

    ReplicationStatus getReplicationStaus() {
        return replicationStaus
    }

    void setReplicationStaus(ReplicationStatus replicationStaus) {
        this.replicationStaus = replicationStaus
    }
}
