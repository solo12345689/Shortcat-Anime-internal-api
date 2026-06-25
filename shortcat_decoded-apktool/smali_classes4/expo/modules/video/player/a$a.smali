.class public final Lexpo/modules/video/player/a$a;
.super Lexpo/modules/video/player/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lexpo/modules/video/player/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final d:Lexpo/modules/video/enums/AudioMixingMode;

.field private final e:Lexpo/modules/video/enums/AudioMixingMode;

.field private final f:Ljava/lang/String;

.field private final g:Z


# direct methods
.method public constructor <init>(Lexpo/modules/video/enums/AudioMixingMode;Lexpo/modules/video/enums/AudioMixingMode;)V
    .locals 1

    .line 1
    const-string v0, "audioMixingMode"

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
    iput-object p1, p0, Lexpo/modules/video/player/a$a;->d:Lexpo/modules/video/enums/AudioMixingMode;

    .line 11
    .line 12
    iput-object p2, p0, Lexpo/modules/video/player/a$a;->e:Lexpo/modules/video/enums/AudioMixingMode;

    .line 13
    .line 14
    const-string p1, "audioMixingModeChange"

    .line 15
    .line 16
    iput-object p1, p0, Lexpo/modules/video/player/a$a;->f:Ljava/lang/String;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lexpo/modules/video/player/a$a;->g:Z

    .line 2
    .line 3
    return v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/player/a$a;->f:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()Lexpo/modules/video/enums/AudioMixingMode;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/player/a$a;->d:Lexpo/modules/video/enums/AudioMixingMode;

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
    instance-of v1, p1, Lexpo/modules/video/player/a$a;

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
    check-cast p1, Lexpo/modules/video/player/a$a;

    .line 12
    .line 13
    iget-object v1, p0, Lexpo/modules/video/player/a$a;->d:Lexpo/modules/video/enums/AudioMixingMode;

    .line 14
    .line 15
    iget-object v3, p1, Lexpo/modules/video/player/a$a;->d:Lexpo/modules/video/enums/AudioMixingMode;

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget-object v1, p0, Lexpo/modules/video/player/a$a;->e:Lexpo/modules/video/enums/AudioMixingMode;

    .line 21
    .line 22
    iget-object p1, p1, Lexpo/modules/video/player/a$a;->e:Lexpo/modules/video/enums/AudioMixingMode;

    .line 23
    .line 24
    if-eq v1, p1, :cond_3

    .line 25
    .line 26
    return v2

    .line 27
    :cond_3
    return v0
.end method

.method public final f()Lexpo/modules/video/enums/AudioMixingMode;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/player/a$a;->e:Lexpo/modules/video/enums/AudioMixingMode;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lexpo/modules/video/player/a$a;->d:Lexpo/modules/video/enums/AudioMixingMode;

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
    iget-object v1, p0, Lexpo/modules/video/player/a$a;->e:Lexpo/modules/video/enums/AudioMixingMode;

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
    iget-object v0, p0, Lexpo/modules/video/player/a$a;->d:Lexpo/modules/video/enums/AudioMixingMode;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/video/player/a$a;->e:Lexpo/modules/video/enums/AudioMixingMode;

    .line 4
    .line 5
    new-instance v2, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v3, "AudioMixingModeChanged(audioMixingMode="

    .line 11
    .line 12
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v0, ", oldAudioMixingMode="

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
