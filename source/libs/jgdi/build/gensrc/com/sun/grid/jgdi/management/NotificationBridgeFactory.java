/*___INFO__MARK_BEGIN__*/
/*************************************************************************
 *
 *  The Contents of this file are made available subject to the terms of
 *  the Sun Industry Standards Source License Version 1.2
 *
 *  Sun Microsystems Inc., March, 2001
 *
 *
 *  Sun Industry Standards Source License Version 1.2
 *  =================================================
 *  The contents of this file are subject to the Sun Industry Standards
 *  Source License Version 1.2 (the "License"); You may not use this file
 *  except in compliance with the License. You may obtain a copy of the
 *  License at http://gridengine.sunsource.net/Gridengine_SISSL_license.html
 *
 *  Software provided under this License is provided on an "AS IS" basis,
 *  WITHOUT WARRANTY OF ANY KIND, EITHER EXPRESSED OR IMPLIED, INCLUDING,
 *  WITHOUT LIMITATION, WARRANTIES THAT THE SOFTWARE IS FREE OF DEFECTS,
 *  MERCHANTABLE, FIT FOR A PARTICULAR PURPOSE, OR NON-INFRINGING.
 *  See the License for the specific provisions governing your rights and
 *  obligations concerning the Software.
 *
 *   The Initial Developer of the Original Code is: Sun Microsystems, Inc.
 *
 *   Copyright: 2001 by Sun Microsystems, Inc.
 *
 *   All Rights Reserved.
 *
 ************************************************************************/
/*___INFO__MARK_END__*/
/**
 *  Generated from java_event_client.jsp
 *  !!! DO NOT EDIT THIS FILE !!!
 */

package com.sun.grid.jgdi.management;

import javax.management.MBeanNotificationInfo;
import javax.management.Notification;
import com.sun.grid.jgdi.EventClient;
import com.sun.grid.jgdi.event.Event;
import java.util.*;
import java.util.logging.Logger;
import java.util.logging.Level;
/** 
 *  Helper class for mapping JGDI Events to JMX notifications
 *
 */
public class NotificationBridgeFactory {

    private static final Logger log = Logger.getLogger(NotificationBridgeFactory.class.getName());
    private static final Map<Class, EventToNotification> eventMap = new HashMap<Class, EventToNotification>();

    private static class EventToNotification {

        private final String eventName;
        private final Class eventClass;
        private final MBeanNotificationInfo notificationInfo;

        public EventToNotification(String eventName, Class eventClass) {
            this.eventName = eventName;
            this.eventClass = eventClass;
            this.notificationInfo = new MBeanNotificationInfo(new String[]{eventName}, eventClass.getName(), null);
        }

        public MBeanNotificationInfo getNotificationInfo() {
            return notificationInfo;
        }

        public Notification createNotification(Event event, long seqNumber) {
            Notification notification = new Notification(eventName, EventClient.class.getName(), seqNumber);
            notification.setUserData(event);
            return notification;
        }
    }

    public static Notification createNotification(Event evt, long seqNumber) {
        EventToNotification bridge = eventMap.get(evt.getClass());
        if (bridge != null) {
            log.log(Level.FINE, "create notification for event {0}", evt);
            return bridge.createNotification(evt, seqNumber);
        } else {
            return null;
        }
    }
    
    public static NotificationBridge newInstance(String url) {    
        return new NotificationBridge(url);
    }
    
    private static void registerEvent(String eventName, Class eventClass) {
        if (log.isLoggable(Level.FINER)) {
            log.entering("NotificationBridgeFactory", "registerEvent", new Object[]{eventName, eventClass});
        }
        EventToNotification evtNot = new EventToNotification(eventName, eventClass);
        eventMap.put(eventClass, evtNot);
        log.exiting("NotificationBridgeFactory", "registerEvent");
    }

    public static MBeanNotificationInfo[] createMBeanNotificationInfo() {
        log.entering("NotificationBridgeFactory", "createMBeanNotificationInfo");
        MBeanNotificationInfo [] ret = new MBeanNotificationInfo[eventMap.size()];
        int i = 0;
        for (Map.Entry<Class, EventToNotification> entry : eventMap.entrySet()) {
            ret[i++] = entry.getValue().getNotificationInfo();
        }
        log.exiting("NotificationBridgeFactory", "createMBeanNotificationInfo", ret);
        return ret;
    }
    
    
    static {

      registerEvent("AddHostgroup", com.sun.grid.jgdi.event.HostgroupAddEvent.class);

      registerEvent("DelHostgroup", com.sun.grid.jgdi.event.HostgroupDelEvent.class);

      registerEvent("ModHostgroup", com.sun.grid.jgdi.event.HostgroupModEvent.class);

      registerEvent("ListHostgroup", com.sun.grid.jgdi.event.HostgroupListEvent.class);

      registerEvent("AddSubmitHost", com.sun.grid.jgdi.event.SubmitHostAddEvent.class);

      registerEvent("DelSubmitHost", com.sun.grid.jgdi.event.SubmitHostDelEvent.class);

      registerEvent("ModSubmitHost", com.sun.grid.jgdi.event.SubmitHostModEvent.class);

      registerEvent("ListSubmitHost", com.sun.grid.jgdi.event.SubmitHostListEvent.class);

      registerEvent("AddExecHost", com.sun.grid.jgdi.event.ExecHostAddEvent.class);

      registerEvent("DelExecHost", com.sun.grid.jgdi.event.ExecHostDelEvent.class);

      registerEvent("ModExecHost", com.sun.grid.jgdi.event.ExecHostModEvent.class);

      registerEvent("ListExecHost", com.sun.grid.jgdi.event.ExecHostListEvent.class);

      registerEvent("AddManager", com.sun.grid.jgdi.event.ManagerAddEvent.class);

      registerEvent("DelManager", com.sun.grid.jgdi.event.ManagerDelEvent.class);

      registerEvent("ModManager", com.sun.grid.jgdi.event.ManagerModEvent.class);

      registerEvent("ListManager", com.sun.grid.jgdi.event.ManagerListEvent.class);

      registerEvent("AddAdvanceReservation", com.sun.grid.jgdi.event.AdvanceReservationAddEvent.class);

      registerEvent("DelAdvanceReservation", com.sun.grid.jgdi.event.AdvanceReservationDelEvent.class);

      registerEvent("ModAdvanceReservation", com.sun.grid.jgdi.event.AdvanceReservationModEvent.class);

      registerEvent("ListAdvanceReservation", com.sun.grid.jgdi.event.AdvanceReservationListEvent.class);

      registerEvent("AddPETask", com.sun.grid.jgdi.event.PETaskAddEvent.class);

      registerEvent("DelPETask", com.sun.grid.jgdi.event.PETaskDelEvent.class);

      registerEvent("ModSchedConf", com.sun.grid.jgdi.event.SchedConfModEvent.class);

      registerEvent("AddConfiguration", com.sun.grid.jgdi.event.ConfigurationAddEvent.class);

      registerEvent("DelConfiguration", com.sun.grid.jgdi.event.ConfigurationDelEvent.class);

      registerEvent("ModConfiguration", com.sun.grid.jgdi.event.ConfigurationModEvent.class);

      registerEvent("ListConfiguration", com.sun.grid.jgdi.event.ConfigurationListEvent.class);

      registerEvent("AddProject", com.sun.grid.jgdi.event.ProjectAddEvent.class);

      registerEvent("DelProject", com.sun.grid.jgdi.event.ProjectDelEvent.class);

      registerEvent("ModProject", com.sun.grid.jgdi.event.ProjectModEvent.class);

      registerEvent("ListProject", com.sun.grid.jgdi.event.ProjectListEvent.class);

      registerEvent("ModShareTree", com.sun.grid.jgdi.event.ShareTreeModEvent.class);

      registerEvent("AddAdminHost", com.sun.grid.jgdi.event.AdminHostAddEvent.class);

      registerEvent("DelAdminHost", com.sun.grid.jgdi.event.AdminHostDelEvent.class);

      registerEvent("ModAdminHost", com.sun.grid.jgdi.event.AdminHostModEvent.class);

      registerEvent("ListAdminHost", com.sun.grid.jgdi.event.AdminHostListEvent.class);

      registerEvent("AddCheckpoint", com.sun.grid.jgdi.event.CheckpointAddEvent.class);

      registerEvent("DelCheckpoint", com.sun.grid.jgdi.event.CheckpointDelEvent.class);

      registerEvent("ModCheckpoint", com.sun.grid.jgdi.event.CheckpointModEvent.class);

      registerEvent("ListCheckpoint", com.sun.grid.jgdi.event.CheckpointListEvent.class);

      registerEvent("AddParallelEnvironment", com.sun.grid.jgdi.event.ParallelEnvironmentAddEvent.class);

      registerEvent("DelParallelEnvironment", com.sun.grid.jgdi.event.ParallelEnvironmentDelEvent.class);

      registerEvent("ModParallelEnvironment", com.sun.grid.jgdi.event.ParallelEnvironmentModEvent.class);

      registerEvent("ListParallelEnvironment", com.sun.grid.jgdi.event.ParallelEnvironmentListEvent.class);

      registerEvent("AddJobTask", com.sun.grid.jgdi.event.JobTaskAddEvent.class);

      registerEvent("DelJobTask", com.sun.grid.jgdi.event.JobTaskDelEvent.class);

      registerEvent("ModJobTask", com.sun.grid.jgdi.event.JobTaskModEvent.class);

      registerEvent("AddComplexEntry", com.sun.grid.jgdi.event.ComplexEntryAddEvent.class);

      registerEvent("DelComplexEntry", com.sun.grid.jgdi.event.ComplexEntryDelEvent.class);

      registerEvent("ModComplexEntry", com.sun.grid.jgdi.event.ComplexEntryModEvent.class);

      registerEvent("ListComplexEntry", com.sun.grid.jgdi.event.ComplexEntryListEvent.class);

      registerEvent("AddClusterQueue", com.sun.grid.jgdi.event.ClusterQueueAddEvent.class);

      registerEvent("DelClusterQueue", com.sun.grid.jgdi.event.ClusterQueueDelEvent.class);

      registerEvent("ModClusterQueue", com.sun.grid.jgdi.event.ClusterQueueModEvent.class);

      registerEvent("ListClusterQueue", com.sun.grid.jgdi.event.ClusterQueueListEvent.class);

      registerEvent("AddJobSchedulingInfo", com.sun.grid.jgdi.event.JobSchedulingInfoAddEvent.class);

      registerEvent("DelJobSchedulingInfo", com.sun.grid.jgdi.event.JobSchedulingInfoDelEvent.class);

      registerEvent("ModJobSchedulingInfo", com.sun.grid.jgdi.event.JobSchedulingInfoModEvent.class);

      registerEvent("ListJobSchedulingInfo", com.sun.grid.jgdi.event.JobSchedulingInfoListEvent.class);

      registerEvent("AddUserSet", com.sun.grid.jgdi.event.UserSetAddEvent.class);

      registerEvent("DelUserSet", com.sun.grid.jgdi.event.UserSetDelEvent.class);

      registerEvent("ModUserSet", com.sun.grid.jgdi.event.UserSetModEvent.class);

      registerEvent("ListUserSet", com.sun.grid.jgdi.event.UserSetListEvent.class);

      registerEvent("AddCalendar", com.sun.grid.jgdi.event.CalendarAddEvent.class);

      registerEvent("DelCalendar", com.sun.grid.jgdi.event.CalendarDelEvent.class);

      registerEvent("ModCalendar", com.sun.grid.jgdi.event.CalendarModEvent.class);

      registerEvent("ListCalendar", com.sun.grid.jgdi.event.CalendarListEvent.class);

      registerEvent("AddOperator", com.sun.grid.jgdi.event.OperatorAddEvent.class);

      registerEvent("DelOperator", com.sun.grid.jgdi.event.OperatorDelEvent.class);

      registerEvent("ModOperator", com.sun.grid.jgdi.event.OperatorModEvent.class);

      registerEvent("ListOperator", com.sun.grid.jgdi.event.OperatorListEvent.class);

      registerEvent("AddJob", com.sun.grid.jgdi.event.JobAddEvent.class);

      registerEvent("DelJob", com.sun.grid.jgdi.event.JobDelEvent.class);

      registerEvent("ModJob", com.sun.grid.jgdi.event.JobModEvent.class);

      registerEvent("ListJob", com.sun.grid.jgdi.event.JobListEvent.class);

      registerEvent("AddQueueInstance", com.sun.grid.jgdi.event.QueueInstanceAddEvent.class);

      registerEvent("DelQueueInstance", com.sun.grid.jgdi.event.QueueInstanceDelEvent.class);

      registerEvent("ModQueueInstance", com.sun.grid.jgdi.event.QueueInstanceModEvent.class);

      registerEvent("AddResourceQuotaSet", com.sun.grid.jgdi.event.ResourceQuotaSetAddEvent.class);

      registerEvent("DelResourceQuotaSet", com.sun.grid.jgdi.event.ResourceQuotaSetDelEvent.class);

      registerEvent("ModResourceQuotaSet", com.sun.grid.jgdi.event.ResourceQuotaSetModEvent.class);

      registerEvent("ListResourceQuotaSet", com.sun.grid.jgdi.event.ResourceQuotaSetListEvent.class);

      registerEvent("AddUser", com.sun.grid.jgdi.event.UserAddEvent.class);

      registerEvent("DelUser", com.sun.grid.jgdi.event.UserDelEvent.class);

      registerEvent("ModUser", com.sun.grid.jgdi.event.UserModEvent.class);

      registerEvent("ListUser", com.sun.grid.jgdi.event.UserListEvent.class);

      registerEvent("QmasterGoesDown", com.sun.grid.jgdi.event.QmasterGoesDownEvent.class);

      registerEvent("SchedulerRun", com.sun.grid.jgdi.event.SchedulerRunEvent.class);

      registerEvent("Shutdown", com.sun.grid.jgdi.event.ShutdownEvent.class);

      registerEvent("JobFinish", com.sun.grid.jgdi.event.JobFinishEvent.class);

      registerEvent("JobUsage", com.sun.grid.jgdi.event.JobUsageEvent.class);

      registerEvent("JobFinalUsage", com.sun.grid.jgdi.event.JobFinalUsageEvent.class);

      registerEvent("JobPriorityMod", com.sun.grid.jgdi.event.JobPriorityModEvent.class);

      registerEvent("QueueInstanceSuspend", com.sun.grid.jgdi.event.QueueInstanceSuspendEvent.class);

      registerEvent("QueueInstanceUnsuspend", com.sun.grid.jgdi.event.QueueInstanceUnsuspendEvent.class);

      registerEvent("ConnectionClosed", com.sun.grid.jgdi.event.ConnectionClosedEvent.class);

   }
}