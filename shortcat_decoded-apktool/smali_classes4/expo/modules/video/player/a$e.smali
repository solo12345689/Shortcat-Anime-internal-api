.class public final Lexpo/modules/video/player/a$e;
.super Lexpo/modules/video/player/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lexpo/modules/video/player/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# instance fields
.field private final d:Z

.field private final e:Ljava/lang/Boolean;

.field private final f:Ljava/lang/String;

.field private final g:Lexpo/modules/video/records/IsPlayingEventPayload;


# direct methods
.method public constructor <init>(ZLjava/lang/Boolean;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lexpo/modules/video/player/a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    .line 4
    .line 5
    iput-boolean p1, p0, Lexpo/modules/video/player/a$e;->d:Z

    .line 6
    .line 7
    iput-object p2, p0, Lexpo/modules/video/player/a$e;->e:Ljava/lang/Boolean;

    .line 8
    .line 9
    const-string v0, "playingChange"

    .line 10
    .line 11
    iput-object v0, p0, Lexpo/modules/video/player/a$e;->f:Ljava/lang/String;

    .line 12
    .line 13
    new-instance v0, Lexpo/modules/video/records/IsPlayingEventPayload;

    .line 14
    .line 15
    invoke-direct {v0, p1, p2}, Lexpo/modules/video/records/IsPlayingEventPayload;-><init>(ZLjava/lang/Boolean;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lexpo/modules/video/player/a$e;->g:Lexpo/modules/video/records/IsPlayingEventPayload;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public bridge synthetic c()Lexpo/modules/video/records/VideoEventPayload;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lexpo/modules/video/player/a$e;->e()Lexpo/modules/video/records/IsPlayingEventPayload;

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
    iget-object v0, p0, Lexpo/modules/video/player/a$e;->f:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public e()Lexpo/modules/video/records/IsPlayingEventPayload;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/player/a$e;->g:Lexpo/modules/video/records/IsPlayingEventPayload;

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
    instance-of v1, p1, Lexpo/modules/video/player/a$e;

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
    check-cast p1, Lexpo/modules/video/player/a$e;

    .line 12
    .line 13
    iget-boolean v1, p0, Lexpo/modules/video/player/a$e;->d:Z

    .line 14
    .line 15
    iget-boolean v3, p1, Lexpo/modules/video/player/a$e;->d:Z

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget-object v1, p0, Lexpo/modules/video/player/a$e;->e:Ljava/lang/Boolean;

    .line 21
    .line 22
    iget-object p1, p1, Lexpo/modules/video/player/a$e;->e:Ljava/lang/Boolean;

    .line 23
    .line 24
    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-nez p1, :cond_3

    .line 29
    .line 30
    return v2

    .line 31
    :cond_3
    return v0
.end method

.method public final f()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/player/a$e;->e:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lexpo/modules/video/player/a$e;->d:Z

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-boolean v0, p0, Lexpo/modules/video/player/a$e;->d:Z

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Lexpo/modules/video/player/a$e;->e:Ljava/lang/Boolean;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    :goto_0
    add-int/2addr v0, v1

    .line 20
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget-boolean v0, p0, Lexpo/modules/video/player/a$e;->d:Z

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/video/player/a$e;->e:Ljava/lang/Boolean;

    .line 4
    .line 5
    new-instance v2, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v3, "IsPlayingChanged(isPlaying="

    .line 11
    .line 12
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v0, ", oldIsPlaying="

    .line 19
    .line 20
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v0, ")"

    .line 27
    .line 28
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    return-object v0
.end method
