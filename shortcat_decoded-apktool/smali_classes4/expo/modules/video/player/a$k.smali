.class public final Lexpo/modules/video/player/a$k;
.super Lexpo/modules/video/player/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lexpo/modules/video/player/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "k"
.end annotation


# instance fields
.field private final d:Lexpo/modules/video/enums/PlayerStatus;

.field private final e:Lexpo/modules/video/enums/PlayerStatus;

.field private final f:Lexpo/modules/video/records/PlaybackError;

.field private final g:Ljava/lang/String;

.field private final h:Lexpo/modules/video/records/StatusChangedEventPayload;


# direct methods
.method public constructor <init>(Lexpo/modules/video/enums/PlayerStatus;Lexpo/modules/video/enums/PlayerStatus;Lexpo/modules/video/records/PlaybackError;)V
    .locals 1

    .line 1
    const-string v0, "status"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {p0, v0}, Lexpo/modules/video/player/a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lexpo/modules/video/player/a$k;->d:Lexpo/modules/video/enums/PlayerStatus;

    .line 11
    .line 12
    iput-object p2, p0, Lexpo/modules/video/player/a$k;->e:Lexpo/modules/video/enums/PlayerStatus;

    .line 13
    .line 14
    iput-object p3, p0, Lexpo/modules/video/player/a$k;->f:Lexpo/modules/video/records/PlaybackError;

    .line 15
    .line 16
    const-string v0, "statusChange"

    .line 17
    .line 18
    iput-object v0, p0, Lexpo/modules/video/player/a$k;->g:Ljava/lang/String;

    .line 19
    .line 20
    new-instance v0, Lexpo/modules/video/records/StatusChangedEventPayload;

    .line 21
    .line 22
    invoke-direct {v0, p1, p2, p3}, Lexpo/modules/video/records/StatusChangedEventPayload;-><init>(Lexpo/modules/video/enums/PlayerStatus;Lexpo/modules/video/enums/PlayerStatus;Lexpo/modules/video/records/PlaybackError;)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lexpo/modules/video/player/a$k;->h:Lexpo/modules/video/records/StatusChangedEventPayload;

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public bridge synthetic c()Lexpo/modules/video/records/VideoEventPayload;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lexpo/modules/video/player/a$k;->f()Lexpo/modules/video/records/StatusChangedEventPayload;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/player/a$k;->g:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()Lexpo/modules/video/records/PlaybackError;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/player/a$k;->f:Lexpo/modules/video/records/PlaybackError;

    .line 2
    .line 3
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lexpo/modules/video/player/a$k;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lexpo/modules/video/player/a$k;

    .line 12
    .line 13
    iget-object v1, p0, Lexpo/modules/video/player/a$k;->d:Lexpo/modules/video/enums/PlayerStatus;

    .line 14
    .line 15
    iget-object v3, p1, Lexpo/modules/video/player/a$k;->d:Lexpo/modules/video/enums/PlayerStatus;

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget-object v1, p0, Lexpo/modules/video/player/a$k;->e:Lexpo/modules/video/enums/PlayerStatus;

    .line 21
    .line 22
    iget-object v3, p1, Lexpo/modules/video/player/a$k;->e:Lexpo/modules/video/enums/PlayerStatus;

    .line 23
    .line 24
    if-eq v1, v3, :cond_3

    .line 25
    .line 26
    return v2

    .line 27
    :cond_3
    iget-object v1, p0, Lexpo/modules/video/player/a$k;->f:Lexpo/modules/video/records/PlaybackError;

    .line 28
    .line 29
    iget-object p1, p1, Lexpo/modules/video/player/a$k;->f:Lexpo/modules/video/records/PlaybackError;

    .line 30
    .line 31
    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-nez p1, :cond_4

    .line 36
    .line 37
    return v2

    .line 38
    :cond_4
    return v0
.end method

.method public f()Lexpo/modules/video/records/StatusChangedEventPayload;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/player/a$k;->h:Lexpo/modules/video/records/StatusChangedEventPayload;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g()Lexpo/modules/video/enums/PlayerStatus;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/player/a$k;->e:Lexpo/modules/video/enums/PlayerStatus;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()Lexpo/modules/video/enums/PlayerStatus;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/player/a$k;->d:Lexpo/modules/video/enums/PlayerStatus;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lexpo/modules/video/player/a$k;->d:Lexpo/modules/video/enums/PlayerStatus;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Lexpo/modules/video/player/a$k;->e:Lexpo/modules/video/enums/PlayerStatus;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    move v1, v2

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    :goto_0
    add-int/2addr v0, v1

    .line 21
    mul-int/lit8 v0, v0, 0x1f

    .line 22
    .line 23
    iget-object v1, p0, Lexpo/modules/video/player/a$k;->f:Lexpo/modules/video/records/PlaybackError;

    .line 24
    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    :goto_1
    add-int/2addr v0, v2

    .line 33
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Lexpo/modules/video/player/a$k;->d:Lexpo/modules/video/enums/PlayerStatus;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/video/player/a$k;->e:Lexpo/modules/video/enums/PlayerStatus;

    .line 4
    .line 5
    iget-object v2, p0, Lexpo/modules/video/player/a$k;->f:Lexpo/modules/video/records/PlaybackError;

    .line 6
    .line 7
    new-instance v3, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string v4, "StatusChanged(status="

    .line 13
    .line 14
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v0, ", oldStatus="

    .line 21
    .line 22
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v0, ", error="

    .line 29
    .line 30
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v0, ")"

    .line 37
    .line 38
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    return-object v0
.end method
