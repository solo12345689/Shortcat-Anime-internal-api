.class public final Lexpo/modules/video/player/a$q;
.super Lexpo/modules/video/player/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lexpo/modules/video/player/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "q"
.end annotation


# instance fields
.field private final d:Lexpo/modules/video/records/VideoSource;

.field private final e:D

.field private final f:Ljava/util/List;

.field private final g:Ljava/util/List;

.field private final h:Ljava/util/List;

.field private final i:Ljava/lang/String;

.field private final j:Lexpo/modules/video/records/VideoSourceLoadedEventPayload;


# direct methods
.method public constructor <init>(Lexpo/modules/video/records/VideoSource;DLjava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 8

    .line 1
    const-string v0, "availableVideoTracks"

    .line 2
    .line 3
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "availableSubtitleTracks"

    .line 7
    .line 8
    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "availableAudioTracks"

    .line 12
    .line 13
    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-direct {p0, v0}, Lexpo/modules/video/player/a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lexpo/modules/video/player/a$q;->d:Lexpo/modules/video/records/VideoSource;

    .line 21
    .line 22
    iput-wide p2, p0, Lexpo/modules/video/player/a$q;->e:D

    .line 23
    .line 24
    iput-object p4, p0, Lexpo/modules/video/player/a$q;->f:Ljava/util/List;

    .line 25
    .line 26
    iput-object p5, p0, Lexpo/modules/video/player/a$q;->g:Ljava/util/List;

    .line 27
    .line 28
    iput-object p6, p0, Lexpo/modules/video/player/a$q;->h:Ljava/util/List;

    .line 29
    .line 30
    const-string v0, "sourceLoad"

    .line 31
    .line 32
    iput-object v0, p0, Lexpo/modules/video/player/a$q;->i:Ljava/lang/String;

    .line 33
    .line 34
    new-instance v1, Lexpo/modules/video/records/VideoSourceLoadedEventPayload;

    .line 35
    .line 36
    move-object v2, p1

    .line 37
    move-wide v3, p2

    .line 38
    move-object v5, p4

    .line 39
    move-object v6, p5

    .line 40
    move-object v7, p6

    .line 41
    invoke-direct/range {v1 .. v7}, Lexpo/modules/video/records/VideoSourceLoadedEventPayload;-><init>(Lexpo/modules/video/records/VideoSource;DLjava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 42
    .line 43
    .line 44
    iput-object v1, p0, Lexpo/modules/video/player/a$q;->j:Lexpo/modules/video/records/VideoSourceLoadedEventPayload;

    .line 45
    .line 46
    return-void
.end method


# virtual methods
.method public bridge synthetic c()Lexpo/modules/video/records/VideoEventPayload;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lexpo/modules/video/player/a$q;->i()Lexpo/modules/video/records/VideoSourceLoadedEventPayload;

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
    iget-object v0, p0, Lexpo/modules/video/player/a$q;->i:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/player/a$q;->h:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lexpo/modules/video/player/a$q;

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
    check-cast p1, Lexpo/modules/video/player/a$q;

    .line 12
    .line 13
    iget-object v1, p0, Lexpo/modules/video/player/a$q;->d:Lexpo/modules/video/records/VideoSource;

    .line 14
    .line 15
    iget-object v3, p1, Lexpo/modules/video/player/a$q;->d:Lexpo/modules/video/records/VideoSource;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-wide v3, p0, Lexpo/modules/video/player/a$q;->e:D

    .line 25
    .line 26
    iget-wide v5, p1, Lexpo/modules/video/player/a$q;->e:D

    .line 27
    .line 28
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget-object v1, p0, Lexpo/modules/video/player/a$q;->f:Ljava/util/List;

    .line 36
    .line 37
    iget-object v3, p1, Lexpo/modules/video/player/a$q;->f:Ljava/util/List;

    .line 38
    .line 39
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    iget-object v1, p0, Lexpo/modules/video/player/a$q;->g:Ljava/util/List;

    .line 47
    .line 48
    iget-object v3, p1, Lexpo/modules/video/player/a$q;->g:Ljava/util/List;

    .line 49
    .line 50
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_5

    .line 55
    .line 56
    return v2

    .line 57
    :cond_5
    iget-object v1, p0, Lexpo/modules/video/player/a$q;->h:Ljava/util/List;

    .line 58
    .line 59
    iget-object p1, p1, Lexpo/modules/video/player/a$q;->h:Ljava/util/List;

    .line 60
    .line 61
    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-nez p1, :cond_6

    .line 66
    .line 67
    return v2

    .line 68
    :cond_6
    return v0
.end method

.method public final f()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/player/a$q;->g:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/player/a$q;->f:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()D
    .locals 2

    .line 1
    iget-wide v0, p0, Lexpo/modules/video/player/a$q;->e:D

    .line 2
    .line 3
    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lexpo/modules/video/player/a$q;->d:Lexpo/modules/video/records/VideoSource;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    .line 12
    .line 13
    iget-wide v1, p0, Lexpo/modules/video/player/a$q;->e:D

    .line 14
    .line 15
    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    add-int/2addr v0, v1

    .line 20
    mul-int/lit8 v0, v0, 0x1f

    .line 21
    .line 22
    iget-object v1, p0, Lexpo/modules/video/player/a$q;->f:Ljava/util/List;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    add-int/2addr v0, v1

    .line 29
    mul-int/lit8 v0, v0, 0x1f

    .line 30
    .line 31
    iget-object v1, p0, Lexpo/modules/video/player/a$q;->g:Ljava/util/List;

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    add-int/2addr v0, v1

    .line 38
    mul-int/lit8 v0, v0, 0x1f

    .line 39
    .line 40
    iget-object v1, p0, Lexpo/modules/video/player/a$q;->h:Ljava/util/List;

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    add-int/2addr v0, v1

    .line 47
    return v0
.end method

.method public i()Lexpo/modules/video/records/VideoSourceLoadedEventPayload;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/player/a$q;->j:Lexpo/modules/video/records/VideoSourceLoadedEventPayload;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j()Lexpo/modules/video/records/VideoSource;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/player/a$q;->d:Lexpo/modules/video/records/VideoSource;

    .line 2
    .line 3
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    .line 1
    iget-object v0, p0, Lexpo/modules/video/player/a$q;->d:Lexpo/modules/video/records/VideoSource;

    .line 2
    .line 3
    iget-wide v1, p0, Lexpo/modules/video/player/a$q;->e:D

    .line 4
    .line 5
    iget-object v3, p0, Lexpo/modules/video/player/a$q;->f:Ljava/util/List;

    .line 6
    .line 7
    iget-object v4, p0, Lexpo/modules/video/player/a$q;->g:Ljava/util/List;

    .line 8
    .line 9
    iget-object v5, p0, Lexpo/modules/video/player/a$q;->h:Ljava/util/List;

    .line 10
    .line 11
    new-instance v6, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v7, "VideoSourceLoaded(videoSource="

    .line 17
    .line 18
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v0, ", duration="

    .line 25
    .line 26
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v6, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v0, ", availableVideoTracks="

    .line 33
    .line 34
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v0, ", availableSubtitleTracks="

    .line 41
    .line 42
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v0, ", availableAudioTracks="

    .line 49
    .line 50
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string v0, ")"

    .line 57
    .line 58
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    return-object v0
.end method
