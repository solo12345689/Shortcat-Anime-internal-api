.class public final Lexpo/modules/filesystem/PathInfo;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljc/b;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\n\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u000e\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\t\u0010\nJ&\u0010\u000b\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00022\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0018\n\u0004\u0008\u0003\u0010\u0017\u0012\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u0018\u0010\u0008\"\u0004\u0008\u0019\u0010\u001aR*\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0018\n\u0004\u0008\u0004\u0010\u001d\u0012\u0004\u0008 \u0010\u001c\u001a\u0004\u0008\u0004\u0010\n\"\u0004\u0008\u001e\u0010\u001f\u00a8\u0006!"
    }
    d2 = {
        "Lexpo/modules/filesystem/PathInfo;",
        "Ljc/b;",
        "",
        "exists",
        "isDirectory",
        "<init>",
        "(ZLjava/lang/Boolean;)V",
        "component1",
        "()Z",
        "component2",
        "()Ljava/lang/Boolean;",
        "copy",
        "(ZLjava/lang/Boolean;)Lexpo/modules/filesystem/PathInfo;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Z",
        "getExists",
        "setExists",
        "(Z)V",
        "getExists$annotations",
        "()V",
        "Ljava/lang/Boolean;",
        "setDirectory",
        "(Ljava/lang/Boolean;)V",
        "isDirectory$annotations",
        "expo-file-system_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private exists:Z

.field private isDirectory:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>(ZLjava/lang/Boolean;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lexpo/modules/filesystem/PathInfo;->exists:Z

    .line 5
    .line 6
    iput-object p2, p0, Lexpo/modules/filesystem/PathInfo;->isDirectory:Ljava/lang/Boolean;

    .line 7
    .line 8
    return-void
.end method

.method public static synthetic copy$default(Lexpo/modules/filesystem/PathInfo;ZLjava/lang/Boolean;ILjava/lang/Object;)Lexpo/modules/filesystem/PathInfo;
    .locals 0

    .line 1
    and-int/lit8 p4, p3, 0x1

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    iget-boolean p1, p0, Lexpo/modules/filesystem/PathInfo;->exists:Z

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 8
    .line 9
    if-eqz p3, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Lexpo/modules/filesystem/PathInfo;->isDirectory:Ljava/lang/Boolean;

    .line 12
    .line 13
    :cond_1
    invoke-virtual {p0, p1, p2}, Lexpo/modules/filesystem/PathInfo;->copy(ZLjava/lang/Boolean;)Lexpo/modules/filesystem/PathInfo;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public static synthetic getExists$annotations()V
    .locals 0
    .annotation runtime Ljc/a;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic isDirectory$annotations()V
    .locals 0
    .annotation runtime Ljc/a;
    .end annotation

    .line 1
    return-void
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lexpo/modules/filesystem/PathInfo;->exists:Z

    .line 2
    .line 3
    return v0
.end method

.method public final component2()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/filesystem/PathInfo;->isDirectory:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-object v0
.end method

.method public final copy(ZLjava/lang/Boolean;)Lexpo/modules/filesystem/PathInfo;
    .locals 1

    .line 1
    new-instance v0, Lexpo/modules/filesystem/PathInfo;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lexpo/modules/filesystem/PathInfo;-><init>(ZLjava/lang/Boolean;)V

    .line 4
    .line 5
    .line 6
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
    instance-of v1, p1, Lexpo/modules/filesystem/PathInfo;

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
    check-cast p1, Lexpo/modules/filesystem/PathInfo;

    .line 12
    .line 13
    iget-boolean v1, p0, Lexpo/modules/filesystem/PathInfo;->exists:Z

    .line 14
    .line 15
    iget-boolean v3, p1, Lexpo/modules/filesystem/PathInfo;->exists:Z

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget-object v1, p0, Lexpo/modules/filesystem/PathInfo;->isDirectory:Ljava/lang/Boolean;

    .line 21
    .line 22
    iget-object p1, p1, Lexpo/modules/filesystem/PathInfo;->isDirectory:Ljava/lang/Boolean;

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

.method public final getExists()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lexpo/modules/filesystem/PathInfo;->exists:Z

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-boolean v0, p0, Lexpo/modules/filesystem/PathInfo;->exists:Z

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
    iget-object v1, p0, Lexpo/modules/filesystem/PathInfo;->isDirectory:Ljava/lang/Boolean;

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

.method public final isDirectory()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/filesystem/PathInfo;->isDirectory:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-object v0
.end method

.method public final setDirectory(Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/filesystem/PathInfo;->isDirectory:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-void
.end method

.method public final setExists(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lexpo/modules/filesystem/PathInfo;->exists:Z

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget-boolean v0, p0, Lexpo/modules/filesystem/PathInfo;->exists:Z

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/filesystem/PathInfo;->isDirectory:Ljava/lang/Boolean;

    .line 4
    .line 5
    new-instance v2, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v3, "PathInfo(exists="

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
    const-string v0, ", isDirectory="

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
