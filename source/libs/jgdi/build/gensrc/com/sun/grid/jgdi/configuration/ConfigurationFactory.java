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
 *  Generated from java_config_factory.jsp
 *  !!! DO NOT EDIT THIS FILE !!!
 */

package com.sun.grid.jgdi.configuration;


import java.util.*;

/**
 *  Factory class for all List/Del/Add/Mod Configuration objects
 */
public class ConfigurationFactory {


      public static QueueInstanceMessage createQueueInstanceMessage() {
         return new QueueInstanceMessageImpl();
      }

      public static QueueInstanceMessage createQueueInstanceMessageWithDefaults() {
         return new QueueInstanceMessageImpl(true);
      }

      public static CalendarQueueState createCalendarQueueState() {
         return new CalendarQueueStateImpl();
      }

      public static CalendarQueueState createCalendarQueueStateWithDefaults() {
         return new CalendarQueueStateImpl(true);
      }

      public static ExecHost createExecHost() {
         return new ExecHostImpl();
      }

      public static ExecHost createExecHostWithDefaults() {
         return new ExecHostImpl(true);
      }

      public static Manager createManager() {
         return new ManagerImpl();
      }

      public static Manager createManagerWithDefaults() {
         return new ManagerImpl(true);
      }

      public static ResourceUtilization createResourceUtilization() {
         return new ResourceUtilizationImpl();
      }

      public static ResourceUtilization createResourceUtilizationWithDefaults() {
         return new ResourceUtilizationImpl(true);
      }

      public static Project createProject() {
         return new ProjectImpl();
      }

      public static Project createProjectWithDefaults() {
         return new ProjectImpl(true);
      }

      public static ShareTree createShareTree() {
         return new ShareTreeImpl();
      }

      public static ShareTree createShareTreeWithDefaults() {
         return new ShareTreeImpl(true);
      }

      public static ResourceDiagramEntry createResourceDiagramEntry() {
         return new ResourceDiagramEntryImpl();
      }

      public static ResourceDiagramEntry createResourceDiagramEntryWithDefaults() {
         return new ResourceDiagramEntryImpl(true);
      }

      public static Binding createBinding() {
         return new BindingImpl();
      }

      public static Binding createBindingWithDefaults() {
         return new BindingImpl(true);
      }

      public static PathAlias createPathAlias() {
         return new PathAliasImpl();
      }

      public static PathAlias createPathAliasWithDefaults() {
         return new PathAliasImpl(true);
      }

      public static JobTask createJobTask() {
         return new JobTaskImpl();
      }

      public static JobTask createJobTaskWithDefaults() {
         return new JobTaskImpl(true);
      }

      public static ComplexEntry createComplexEntry() {
         return new ComplexEntryImpl();
      }

      public static ComplexEntry createComplexEntryWithDefaults() {
         return new ComplexEntryImpl(true);
      }

      public static ConfigurationElement createConfigurationElement() {
         return new ConfigurationElementImpl();
      }

      public static ConfigurationElement createConfigurationElementWithDefaults() {
         return new ConfigurationElementImpl(true);
      }

      public static Range createRange() {
         return new RangeImpl();
      }

      public static Range createRangeWithDefaults() {
         return new RangeImpl(true);
      }

      public static PathName createPathName() {
         return new PathNameImpl();
      }

      public static PathName createPathNameWithDefaults() {
         return new PathNameImpl(true);
      }

      public static Operator createOperator() {
         return new OperatorImpl();
      }

      public static Operator createOperatorWithDefaults() {
         return new OperatorImpl(true);
      }

      public static Subordinate createSubordinate() {
         return new SubordinateImpl();
      }

      public static Subordinate createSubordinateWithDefaults() {
         return new SubordinateImpl(true);
      }

      public static ResourceQuotaRuleFilter createResourceQuotaRuleFilter() {
         return new ResourceQuotaRuleFilterImpl();
      }

      public static ResourceQuotaRuleFilter createResourceQuotaRuleFilterWithDefaults() {
         return new ResourceQuotaRuleFilterImpl(true);
      }

      public static User createUser() {
         return new UserImpl();
      }

      public static User createUserWithDefaults() {
         return new UserImpl(true);
      }

      public static ULNG createULNG() {
         return new ULNGImpl();
      }

      public static ULNG createULNGWithDefaults() {
         return new ULNGImpl(true);
      }

      public static Hostgroup createHostgroup() {
         return new HostgroupImpl();
      }

      public static Hostgroup createHostgroupWithDefaults() {
         return new HostgroupImpl(true);
      }

      public static SubmitHost createSubmitHost() {
         return new SubmitHostImpl();
      }

      public static SubmitHost createSubmitHostWithDefaults() {
         return new SubmitHostImpl(true);
      }

      public static ARA createARA() {
         return new ARAImpl();
      }

      public static ARA createARAWithDefaults() {
         return new ARAImpl(true);
      }

      public static EventSubcribtion createEventSubcribtion() {
         return new EventSubcribtionImpl();
      }

      public static EventSubcribtion createEventSubcribtionWithDefaults() {
         return new EventSubcribtionImpl(true);
      }

      public static JG createJG() {
         return new JGImpl();
      }

      public static JG createJGWithDefaults() {
         return new JGImpl(true);
      }

      public static AdvanceReservation createAdvanceReservation() {
         return new AdvanceReservationImpl();
      }

      public static AdvanceReservation createAdvanceReservationWithDefaults() {
         return new AdvanceReservationImpl(true);
      }

      public static PETask createPETask() {
         return new PETaskImpl();
      }

      public static PETask createPETaskWithDefaults() {
         return new PETaskImpl(true);
      }

      public static SchedConf createSchedConf() {
         return new SchedConfImpl();
      }

      public static SchedConf createSchedConfWithDefaults() {
         return new SchedConfImpl(true);
      }

      public static JobReference createJobReference() {
         return new JobReferenceImpl();
      }

      public static JobReference createJobReferenceWithDefaults() {
         return new JobReferenceImpl(true);
      }

      public static Configuration createConfiguration() {
         return new ConfigurationImpl();
      }

      public static Configuration createConfigurationWithDefaults() {
         return new ConfigurationImpl(true);
      }

      public static ResourceQuotaRule createResourceQuotaRule() {
         return new ResourceQuotaRuleImpl();
      }

      public static ResourceQuotaRule createResourceQuotaRuleWithDefaults() {
         return new ResourceQuotaRuleImpl(true);
      }

      public static FPET createFPET() {
         return new FPETImpl();
      }

      public static FPET createFPETWithDefaults() {
         return new FPETImpl(true);
      }

      public static AdminHost createAdminHost() {
         return new AdminHostImpl();
      }

      public static AdminHost createAdminHostWithDefaults() {
         return new AdminHostImpl(true);
      }

      public static Checkpoint createCheckpoint() {
         return new CheckpointImpl();
      }

      public static Checkpoint createCheckpointWithDefaults() {
         return new CheckpointImpl(true);
      }

      public static ParallelEnvironment createParallelEnvironment() {
         return new ParallelEnvironmentImpl();
      }

      public static ParallelEnvironment createParallelEnvironmentWithDefaults() {
         return new ParallelEnvironmentImpl(true);
      }

      public static ClusterQueue createClusterQueue() {
         return new ClusterQueueImpl();
      }

      public static ClusterQueue createClusterQueueWithDefaults() {
         return new ClusterQueueImpl(true);
      }

      public static MailReceiver createMailReceiver() {
         return new MailReceiverImpl();
      }

      public static MailReceiver createMailReceiverWithDefaults() {
         return new MailReceiverImpl(true);
      }

      public static ResourceQuotaRuleLimit createResourceQuotaRuleLimit() {
         return new ResourceQuotaRuleLimitImpl();
      }

      public static ResourceQuotaRuleLimit createResourceQuotaRuleLimitWithDefaults() {
         return new ResourceQuotaRuleLimitImpl(true);
      }

      public static JobSchedulingInfo createJobSchedulingInfo() {
         return new JobSchedulingInfoImpl();
      }

      public static JobSchedulingInfo createJobSchedulingInfoWithDefaults() {
         return new JobSchedulingInfoImpl(true);
      }

      public static UserSet createUserSet() {
         return new UserSetImpl();
      }

      public static UserSet createUserSetWithDefaults() {
         return new UserSetImpl(true);
      }

      public static Calendar createCalendar() {
         return new CalendarImpl();
      }

      public static Calendar createCalendarWithDefaults() {
         return new CalendarImpl(true);
      }

      public static Event createEvent() {
         return new EventImpl();
      }

      public static Event createEventWithDefaults() {
         return new EventImpl(true);
      }

      public static Job createJob() {
         return new JobImpl();
      }

      public static Job createJobWithDefaults() {
         return new JobImpl(true);
      }

      public static QueueInstance createQueueInstance() {
         return new QueueInstanceImpl();
      }

      public static QueueInstance createQueueInstanceWithDefaults() {
         return new QueueInstanceImpl(true);
      }

      public static JobSchedulingMessage createJobSchedulingMessage() {
         return new JobSchedulingMessageImpl();
      }

      public static JobSchedulingMessage createJobSchedulingMessageWithDefaults() {
         return new JobSchedulingMessageImpl(true);
      }

      public static ResourceQuotaSet createResourceQuotaSet() {
         return new ResourceQuotaSetImpl();
      }

      public static ResourceQuotaSet createResourceQuotaSetWithDefaults() {
         return new ResourceQuotaSetImpl(true);
      }

      public static EventClient createEventClient() {
         return new EventClientImpl();
      }

      public static EventClient createEventClientWithDefaults() {
         return new EventClientImpl(true);
      }
  

}
