.class public final LE3/U6;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LE3/U6$b;
    }
.end annotation


# static fields
.field public static final b:LE3/U6;

.field private static final c:Ljava/lang/String;


# instance fields
.field public final a:LP9/w;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LE3/U6$b;

    .line 2
    .line 3
    invoke-direct {v0}, LE3/U6$b;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, LE3/U6$b;->e()LE3/U6;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, LE3/U6;->b:LE3/U6;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-static {v0}, Lt2/a0;->H0(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, LE3/U6;->c:Ljava/lang/String;

    .line 18
    .line 19
    return-void
.end method

.method private constructor <init>(Ljava/util/Collection;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, LP9/w;->v(Ljava/util/Collection;)LP9/w;

    move-result-object p1

    iput-object p1, p0, LE3/U6;->a:LP9/w;

    return-void
.end method

.method synthetic constructor <init>(Ljava/util/Collection;LE3/U6$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LE3/U6;-><init>(Ljava/util/Collection;)V

    return-void
.end method

.method private static d(Ljava/util/Collection;I)Z
    .locals 1

    .line 1
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, LE3/T6;

    .line 16
    .line 17
    iget v0, v0, LE3/T6;->a:I

    .line 18
    .line 19
    if-ne v0, p1, :cond_0

    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :cond_1
    const/4 p0, 0x0

    .line 24
    return p0
.end method

.method public static e(Landroid/os/Bundle;)LE3/U6;
    .locals 3

    .line 1
    sget-object v0, LE3/U6;->c:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    const-string p0, "SessionCommands"

    .line 10
    .line 11
    const-string v0, "Missing commands. Creating an empty SessionCommands"

    .line 12
    .line 13
    invoke-static {p0, v0}, Lt2/w;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sget-object p0, LE3/U6;->b:LE3/U6;

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    new-instance v0, LE3/U6$b;

    .line 20
    .line 21
    invoke-direct {v0}, LE3/U6$b;-><init>()V

    .line 22
    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    :goto_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-ge v1, v2, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Landroid/os/Bundle;

    .line 36
    .line 37
    invoke-static {v2}, LE3/T6;->a(Landroid/os/Bundle;)LE3/T6;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v0, v2}, LE3/U6$b;->a(LE3/T6;)LE3/U6$b;

    .line 42
    .line 43
    .line 44
    add-int/lit8 v1, v1, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    invoke-virtual {v0}, LE3/U6$b;->e()LE3/U6;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0
.end method


# virtual methods
.method public a()LE3/U6$b;
    .locals 2

    .line 1
    new-instance v0, LE3/U6$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, LE3/U6$b;-><init>(LE3/U6;LE3/U6$a;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public b(I)Z
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    const/4 v0, 0x0

    .line 6
    :goto_0
    const-string v1, "Use contains(Command) for custom command"

    .line 7
    .line 8
    invoke-static {v0, v1}, Lt2/a;->b(ZLjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LE3/U6;->a:LP9/w;

    .line 12
    .line 13
    invoke-static {v0, p1}, LE3/U6;->d(Ljava/util/Collection;I)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
.end method

.method public c(LE3/T6;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LE3/U6;->a:LP9/w;

    .line 2
    .line 3
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {v0, p1}, LP9/s;->contains(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    instance-of v0, p1, LE3/U6;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_1
    check-cast p1, LE3/U6;

    .line 12
    .line 13
    iget-object v0, p0, LE3/U6;->a:LP9/w;

    .line 14
    .line 15
    iget-object p1, p1, LE3/U6;->a:LP9/w;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, LP9/w;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method

.method public f()Landroid/os/Bundle;
    .locals 4

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, LE3/U6;->a:LP9/w;

    .line 12
    .line 13
    invoke-virtual {v2}, LP9/w;->l()LP9/X;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    check-cast v3, LE3/T6;

    .line 28
    .line 29
    invoke-virtual {v3}, LE3/T6;->b()Landroid/os/Bundle;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    sget-object v2, LE3/U6;->c:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 40
    .line 41
    .line 42
    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, LE3/U6;->a:LP9/w;

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, LK1/b;->b([Ljava/lang/Object;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method
