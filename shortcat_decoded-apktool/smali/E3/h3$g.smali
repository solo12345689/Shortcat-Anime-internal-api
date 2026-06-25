.class public final LE3/h3$g;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE3/h3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation


# instance fields
.field private final a:LF3/q$b;

.field private final b:I

.field private final c:I

.field private final d:Z

.field private final e:LE3/h3$f;

.field private final f:Landroid/os/Bundle;

.field private final g:I


# direct methods
.method constructor <init>(LF3/q$b;IIZLE3/h3$f;Landroid/os/Bundle;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LE3/h3$g;->a:LF3/q$b;

    .line 5
    .line 6
    iput p2, p0, LE3/h3$g;->b:I

    .line 7
    .line 8
    iput p3, p0, LE3/h3$g;->c:I

    .line 9
    .line 10
    iput-boolean p4, p0, LE3/h3$g;->d:Z

    .line 11
    .line 12
    iput-object p5, p0, LE3/h3$g;->e:LE3/h3$f;

    .line 13
    .line 14
    iput-object p6, p0, LE3/h3$g;->f:Landroid/os/Bundle;

    .line 15
    .line 16
    iput p7, p0, LE3/h3$g;->g:I

    .line 17
    .line 18
    return-void
.end method

.method static a()LE3/h3$g;
    .locals 8

    .line 1
    new-instance v1, LF3/q$b;

    .line 2
    .line 3
    const-string v0, "android.media.session.MediaController"

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    invoke-direct {v1, v0, v2, v2}, LF3/q$b;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    new-instance v0, LE3/h3$g;

    .line 10
    .line 11
    sget-object v6, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 12
    .line 13
    const/4 v7, 0x0

    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x0

    .line 16
    const/4 v4, 0x0

    .line 17
    const/4 v5, 0x0

    .line 18
    invoke-direct/range {v0 .. v7}, LE3/h3$g;-><init>(LF3/q$b;IIZLE3/h3$f;Landroid/os/Bundle;I)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method


# virtual methods
.method public b()Landroid/os/Bundle;
    .locals 2

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    iget-object v1, p0, LE3/h3$g;->f:Landroid/os/Bundle;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method c()LE3/h3$f;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/h3$g;->e:LE3/h3$f;

    .line 2
    .line 3
    return-object v0
.end method

.method public d()I
    .locals 1

    .line 1
    iget v0, p0, LE3/h3$g;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public e()I
    .locals 1

    .line 1
    iget v0, p0, LE3/h3$g;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, LE3/h3$g;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return p1

    .line 7
    :cond_0
    if-ne p0, p1, :cond_1

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    return p1

    .line 11
    :cond_1
    check-cast p1, LE3/h3$g;

    .line 12
    .line 13
    iget-object v0, p0, LE3/h3$g;->e:LE3/h3$f;

    .line 14
    .line 15
    if-nez v0, :cond_3

    .line 16
    .line 17
    iget-object v1, p1, LE3/h3$g;->e:LE3/h3$f;

    .line 18
    .line 19
    if-eqz v1, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    iget-object v0, p0, LE3/h3$g;->a:LF3/q$b;

    .line 23
    .line 24
    iget-object p1, p1, LE3/h3$g;->a:LF3/q$b;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, LF3/q$b;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    return p1

    .line 31
    :cond_3
    :goto_0
    iget-object p1, p1, LE3/h3$g;->e:LE3/h3$f;

    .line 32
    .line 33
    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    return p1
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/h3$g;->a:LF3/q$b;

    .line 2
    .line 3
    invoke-virtual {v0}, LF3/q$b;->a()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method g()LF3/q$b;
    .locals 1

    .line 1
    iget-object v0, p0, LE3/h3$g;->a:LF3/q$b;

    .line 2
    .line 3
    return-object v0
.end method

.method public h()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LE3/h3$g;->d:Z

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, LE3/h3$g;->e:LE3/h3$f;

    .line 2
    .line 3
    iget-object v1, p0, LE3/h3$g;->a:LF3/q$b;

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "ControllerInfo {pkg="

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, LE3/h3$g;->a:LF3/q$b;

    .line 12
    .line 13
    invoke-virtual {v1}, LF3/q$b;->a()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ", uid="

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, LE3/h3$g;->a:LF3/q$b;

    .line 26
    .line 27
    invoke-virtual {v1}, LF3/q$b;->c()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v1, "}"

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    return-object v0
.end method
