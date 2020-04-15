package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Repository {
	
	private Long id;
	
	@JsonProperty("node_id")
	private String nodeId;
	
	private String name;
	
	@JsonProperty("full_name")
	private String fullName;
	
	@JsonProperty("private")
	private Boolean privateRepository;
	
	private Owner owner;
	
	
	public Owner getOwner() {
		return owner;
	}
	
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	
	@JsonProperty("html_url")
	private String htmlUrl;
	
	
	@JsonProperty("contributors_url")
	private String 	contributorsUrl;
	
	
	public String getContributorsUrl() {
		return contributorsUrl;
	}

	public void setContributorsUrl(String contributorsUrl) {
		this.contributorsUrl = contributorsUrl;
	}
	
	
	private String 	description;

	private String 	fork;
	
	private String 	url;
	
	@JsonProperty("forks_url")
	private String 	forksUrl;
	
	@JsonProperty("keys_url")
	private String 	keysUrl;
	
	@JsonProperty("collaborators_url")
	private String 	collaboratorsUrl;
	
	@JsonProperty("teams_url")
	private String 	teamsUrl;
	
	@JsonProperty("hooks_url")
	private String 	hooksUrl;
	
	@JsonProperty("issue_events_url")
	private String 	issueEventsUrl;
	
	@JsonProperty("events_url")
	private String 	eventsUrl;
	
	@JsonProperty("assignees_url")
	private String 	assigneesUrl;
	
	@JsonProperty("branches_url")
	private String 	branchesUrl;
	
	@JsonProperty("tags_url")
	private String 	tagsUrl;
	
	@JsonProperty("blobs_url")
	private String 	blobsUrl;
	
	@JsonProperty("git_tags_url")
	private String 	gitTagsUrl;
	
	@JsonProperty("git_refs_url")
	private String 	gitRefsUrl;
	
	@JsonProperty("trees_url")
	private String 	treesUrl;
	
	@JsonProperty("statuses_url")
	private String 	statusesUrl;
	

	@JsonProperty("languages_url")
	
	private String 	languagesUrl;
	
	@JsonProperty("stargazers_url")
	private String 	stargazersUrl;
	
	@JsonProperty("subscribers_url")
	private String 	subscribersUrl;
	
	@JsonProperty("subscription_url")
	private String 	subscriptionUrl;
	@JsonProperty("commits_url")
	private String 	commitsUrl;
	@JsonProperty("git_commits_url")
	private String 	gitCommitsUrl;
	@JsonProperty("comments_url")
	private String 	commentsUrl;
	
	@JsonProperty("issue_comment_url")
	private String 	issueCommentUrl;
	
	@JsonProperty("contents_url")
	private String 	contentsUrl;
	
	@JsonProperty("compare_url")
	
	private String 	compareUrl;
	
	@JsonProperty("merges_url")
	private String 	mergesUrl;
	
	@JsonProperty("archive_url")
	private String 	archiveUrl;
	
	@JsonProperty("downloads_url")
	private String 	downloadsUrl;
	
	@JsonProperty("issues_url")
	private String 	issuesUrl;
	
	@JsonProperty("pulls_url")
	private String 	pullsUrl;
	
	@JsonProperty("milestones_url")
	private String 	milestonesUrl;
	
	@JsonProperty("notifications_ur")
	private String 	notificationsUrl;
	
	@JsonProperty("labels_url")
	private String 	labelsUrl;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNodeId() {
		return nodeId;
	}

	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Boolean getPrivateRepository() {
		return privateRepository;
	}

	public void setPrivateRepository(Boolean privateRepository) {
		this.privateRepository = privateRepository;
	}

	public String getHtmlUrl() {
		return htmlUrl;
	}

	public void setHtmlUrl(String htmlUrl) {
		this.htmlUrl = htmlUrl;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFork() {
		return fork;
	}

	public void setFork(String fork) {
		this.fork = fork;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getForksUrl() {
		return forksUrl;
	}

	public void setForksUrl(String forksUrl) {
		this.forksUrl = forksUrl;
	}

	public String getKeysUrl() {
		return keysUrl;
	}

	public void setKeysUrl(String keysUrl) {
		this.keysUrl = keysUrl;
	}

	public String getCollaboratorsUrl() {
		return collaboratorsUrl;
	}

	public void setCollaboratorsUrl(String collaboratorsUrl) {
		this.collaboratorsUrl = collaboratorsUrl;
	}

	public String getTeamsUrl() {
		return teamsUrl;
	}

	public void setTeamsUrl(String teamsUrl) {
		this.teamsUrl = teamsUrl;
	}

	public String getHooksUrl() {
		return hooksUrl;
	}

	public void setHooksUrl(String hooksUrl) {
		this.hooksUrl = hooksUrl;
	}

	public String getIssueEventsUrl() {
		return issueEventsUrl;
	}

	public void setIssueEventsUrl(String issueEventsUrl) {
		this.issueEventsUrl = issueEventsUrl;
	}

	public String getEventsUrl() {
		return eventsUrl;
	}

	public void setEventsUrl(String eventsUrl) {
		this.eventsUrl = eventsUrl;
	}

	public String getAssigneesUrl() {
		return assigneesUrl;
	}

	public void setAssigneesUrl(String assigneesUrl) {
		this.assigneesUrl = assigneesUrl;
	}

	public String getBranchesUrl() {
		return branchesUrl;
	}

	public void setBranchesUrl(String branchesUrl) {
		this.branchesUrl = branchesUrl;
	}

	public String getTagsUrl() {
		return tagsUrl;
	}

	public void setTagsUrl(String tagsUrl) {
		this.tagsUrl = tagsUrl;
	}

	public String getBlobsUrl() {
		return blobsUrl;
	}

	public void setBlobsUrl(String blobsUrl) {
		this.blobsUrl = blobsUrl;
	}

	public String getGitTagsUrl() {
		return gitTagsUrl;
	}

	public void setGitTagsUrl(String gitTagsUrl) {
		this.gitTagsUrl = gitTagsUrl;
	}

	public String getGitRefsUrl() {
		return gitRefsUrl;
	}

	public void setGitRefsUrl(String gitRefsUrl) {
		this.gitRefsUrl = gitRefsUrl;
	}

	public String getTreesUrl() {
		return treesUrl;
	}

	public void setTreesUrl(String treesUrl) {
		this.treesUrl = treesUrl;
	}

	public String getStatusesUrl() {
		return statusesUrl;
	}

	public void setStatusesUrl(String statusesUrl) {
		this.statusesUrl = statusesUrl;
	}

	public String getLanguagesUrl() {
		return languagesUrl;
	}

	public void setLanguagesUrl(String languagesUrl) {
		this.languagesUrl = languagesUrl;
	}

	public String getStargazersUrl() {
		return stargazersUrl;
	}

	public void setStargazersUrl(String stargazersUrl) {
		this.stargazersUrl = stargazersUrl;
	}

	public String getSubscribersUrl() {
		return subscribersUrl;
	}

	public void setSubscribersUrl(String subscribersUrl) {
		this.subscribersUrl = subscribersUrl;
	}

	public String getSubscriptionUrl() {
		return subscriptionUrl;
	}

	public void setSubscriptionUrl(String subscriptionUrl) {
		this.subscriptionUrl = subscriptionUrl;
	}

	public String getCommitsUrl() {
		return commitsUrl;
	}

	public void setCommitsUrl(String commitsUrl) {
		this.commitsUrl = commitsUrl;
	}

	public String getGitCommitsUrl() {
		return gitCommitsUrl;
	}

	public void setGitCommitsUrl(String gitCommitsUrl) {
		this.gitCommitsUrl = gitCommitsUrl;
	}

	public String getCommentsUrl() {
		return commentsUrl;
	}

	public void setCommentsUrl(String commentsUrl) {
		this.commentsUrl = commentsUrl;
	}

	public String getIssueCommentUrl() {
		return issueCommentUrl;
	}

	public void setIssueCommentUrl(String issueCommentUrl) {
		this.issueCommentUrl = issueCommentUrl;
	}

	public String getContentsUrl() {
		return contentsUrl;
	}

	public void setContentsUrl(String contentsUrl) {
		this.contentsUrl = contentsUrl;
	}

	public String getCompareUrl() {
		return compareUrl;
	}

	public void setCompareUrl(String compareUrl) {
		this.compareUrl = compareUrl;
	}

	public String getMergesUrl() {
		return mergesUrl;
	}

	public void setMergesUrl(String mergesUrl) {
		this.mergesUrl = mergesUrl;
	}

	public String getArchiveUrl() {
		return archiveUrl;
	}

	public void setArchiveUrl(String archiveUrl) {
		this.archiveUrl = archiveUrl;
	}

	public String getDownloadsUrl() {
		return downloadsUrl;
	}

	public void setDownloadsUrl(String downloadsUrl) {
		this.downloadsUrl = downloadsUrl;
	}

	public String getIssuesUrl() {
		return issuesUrl;
	}

	public void setIssuesUrl(String issuesUrl) {
		this.issuesUrl = issuesUrl;
	}

	public String getPullsUrl() {
		return pullsUrl;
	}

	public void setPullsUrl(String pullsUrl) {
		this.pullsUrl = pullsUrl;
	}

	public String getMilestonesUrl() {
		return milestonesUrl;
	}

	public void setMilestonesUrl(String milestonesUrl) {
		this.milestonesUrl = milestonesUrl;
	}

	public String getNotificationsUrl() {
		return notificationsUrl;
	}

	public void setNotificationsUrl(String notificationsUrl) {
		this.notificationsUrl = notificationsUrl;
	}

	public String getLabelsUrl() {
		return labelsUrl;
	}

	public void setLabelsUrl(String labelsUrl) {
		this.labelsUrl = labelsUrl;
	}

	public String getReleasesUrl() {
		return releasesUrl;
	}

	public void setReleasesUrl(String releasesUrl) {
		this.releasesUrl = releasesUrl;
	}

	public String getDeploymentsUrl() {
		return deploymentsUrl;
	}

	public void setDeploymentsUrl(String deploymentsUrl) {
		this.deploymentsUrl = deploymentsUrl;
	}

	@JsonProperty("releases_url")
	private String 	releasesUrl;
	
	@JsonProperty("deployments_url")
	private String 	deploymentsUrl;


	@Override
	public String toString() {
		return "Repository [id=" + id + ", nodeId=" + nodeId + ", name=" + name + ", fullName=" + fullName
				+ ", privateRepository=" + privateRepository + ", owner=" + owner + ", htmlUrl=" + htmlUrl
				+ ", contributorsUrl=" + contributorsUrl + ", description=" + description + ", fork=" + fork + ", url="
				+ url + ", forksUrl=" + forksUrl + ", keysUrl=" + keysUrl + ", collaboratorsUrl=" + collaboratorsUrl
				+ ", teamsUrl=" + teamsUrl + ", hooksUrl=" + hooksUrl + ", issueEventsUrl=" + issueEventsUrl
				+ ", eventsUrl=" + eventsUrl + ", assigneesUrl=" + assigneesUrl + ", branchesUrl=" + branchesUrl
				+ ", tagsUrl=" + tagsUrl + ", blobsUrl=" + blobsUrl + ", gitTagsUrl=" + gitTagsUrl + ", gitRefsUrl="
				+ gitRefsUrl + ", treesUrl=" + treesUrl + ", statusesUrl=" + statusesUrl + ", languagesUrl="
				+ languagesUrl + ", stargazersUrl=" + stargazersUrl + ", subscribersUrl=" + subscribersUrl
				+ ", subscriptionUrl=" + subscriptionUrl + ", commitsUrl=" + commitsUrl + ", gitCommitsUrl="
				+ gitCommitsUrl + ", commentsUrl=" + commentsUrl + ", issueCommentUrl=" + issueCommentUrl
				+ ", contentsUrl=" + contentsUrl + ", compareUrl=" + compareUrl + ", mergesUrl=" + mergesUrl
				+ ", archiveUrl=" + archiveUrl + ", downloadsUrl=" + downloadsUrl + ", issuesUrl=" + issuesUrl
				+ ", pullsUrl=" + pullsUrl + ", milestonesUrl=" + milestonesUrl + ", notificationsUrl="
				+ notificationsUrl + ", labelsUrl=" + labelsUrl + ", releasesUrl=" + releasesUrl + ", deploymentsUrl="
				+ deploymentsUrl + "]";
	}
	
	
	
	


}
