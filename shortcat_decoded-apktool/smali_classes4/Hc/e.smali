.class public final LHc/e;
.super Lgc/c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LHc/n;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\u00088VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000cR\u001b\u0010\u0012\u001a\u00020\u000e8VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\n\u001a\u0004\u0008\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\n\u001a\u0004\u0008\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\n\u001a\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001d"
    }
    d2 = {
        "LHc/e;",
        "Lgc/c;",
        "LHc/n;",
        "<init>",
        "()V",
        "Lgc/e;",
        "n",
        "()Lgc/e;",
        "LIc/b;",
        "d",
        "Lkotlin/Lazy;",
        "F",
        "()LIc/b;",
        "groupManager",
        "LIc/d;",
        "e",
        "D",
        "()LIc/d;",
        "channelManager",
        "LJc/c;",
        "f",
        "E",
        "()LJc/c;",
        "channelSerializer",
        "LJc/a;",
        "g",
        "G",
        "()LJc/a;",
        "groupSerializer",
        "expo-notifications_release"
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
.field private final d:Lkotlin/Lazy;

.field private final e:Lkotlin/Lazy;

.field private final f:Lkotlin/Lazy;

.field private final g:Lkotlin/Lazy;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lgc/c;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LHc/a;

    .line 5
    .line 6
    invoke-direct {v0, p0}, LHc/a;-><init>(LHc/e;)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, LHc/e;->d:Lkotlin/Lazy;

    .line 14
    .line 15
    new-instance v0, LHc/b;

    .line 16
    .line 17
    invoke-direct {v0, p0}, LHc/b;-><init>(LHc/e;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iput-object v0, p0, LHc/e;->e:Lkotlin/Lazy;

    .line 25
    .line 26
    new-instance v0, LHc/c;

    .line 27
    .line 28
    invoke-direct {v0}, LHc/c;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iput-object v0, p0, LHc/e;->f:Lkotlin/Lazy;

    .line 36
    .line 37
    new-instance v0, LHc/d;

    .line 38
    .line 39
    invoke-direct {v0, p0}, LHc/d;-><init>(LHc/e;)V

    .line 40
    .line 41
    .line 42
    invoke-static {v0}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, LHc/e;->g:Lkotlin/Lazy;

    .line 47
    .line 48
    return-void
.end method

.method public static synthetic A(LHc/e;)LIc/b;
    .locals 0

    .line 1
    invoke-static {p0}, LHc/e;->H(LHc/e;)LIc/b;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final B(LHc/e;)LIc/d;
    .locals 2

    .line 1
    new-instance v0, LIc/d;

    .line 2
    .line 3
    invoke-virtual {p0}, Lgc/c;->i()LUb/d;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, LUb/d;->B()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {p0}, LHc/e;->F()LIc/b;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-direct {v0, v1, p0}, LIc/d;-><init>(Landroid/content/Context;LIc/e;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method private static final C()LJc/c;
    .locals 1

    .line 1
    new-instance v0, LJc/c;

    .line 2
    .line 3
    invoke-direct {v0}, LJc/c;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private static final H(LHc/e;)LIc/b;
    .locals 1

    .line 1
    new-instance v0, LIc/b;

    .line 2
    .line 3
    invoke-virtual {p0}, Lgc/c;->i()LUb/d;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, LUb/d;->B()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-direct {v0, p0}, LIc/b;-><init>(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method private static final I(LHc/e;)LJc/a;
    .locals 1

    .line 1
    new-instance v0, LJc/a;

    .line 2
    .line 3
    invoke-virtual {p0}, LHc/e;->E()LJc/c;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0}, LJc/a;-><init>(LJc/e;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public static synthetic x()LJc/c;
    .locals 1

    .line 1
    invoke-static {}, LHc/e;->C()LJc/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic y(LHc/e;)LJc/a;
    .locals 0

    .line 1
    invoke-static {p0}, LHc/e;->I(LHc/e;)LJc/a;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic z(LHc/e;)LIc/d;
    .locals 0

    .line 1
    invoke-static {p0}, LHc/e;->B(LHc/e;)LIc/d;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public D()LIc/d;
    .locals 1

    .line 1
    iget-object v0, p0, LHc/e;->e:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LIc/d;

    .line 8
    .line 9
    return-object v0
.end method

.method public E()LJc/c;
    .locals 1

    .line 1
    iget-object v0, p0, LHc/e;->f:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LJc/c;

    .line 8
    .line 9
    return-object v0
.end method

.method public F()LIc/b;
    .locals 1

    .line 1
    iget-object v0, p0, LHc/e;->d:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LIc/b;

    .line 8
    .line 9
    return-object v0
.end method

.method public G()LJc/a;
    .locals 1

    .line 1
    iget-object v0, p0, LHc/e;->g:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LJc/a;

    .line 8
    .line 9
    return-object v0
.end method

.method public bridge synthetic e()LJc/e;
    .locals 1

    .line 1
    invoke-virtual {p0}, LHc/e;->E()LJc/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic h()LJc/d;
    .locals 1

    .line 1
    invoke-virtual {p0}, LHc/e;->G()LJc/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic j()LIc/f;
    .locals 1

    .line 1
    invoke-virtual {p0}, LHc/e;->D()LIc/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic k()LIc/e;
    .locals 1

    .line 1
    invoke-virtual {p0}, LHc/e;->F()LIc/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public n()Lgc/e;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v0, ".ModuleDefinition"

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    new-instance v1, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    const-string v2, "["

    .line 28
    .line 29
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v2, "ExpoModulesCore"

    .line 33
    .line 34
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v2, "] "

    .line 38
    .line 39
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-static {v0}, LX3/a;->c(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    :try_start_0
    new-instance v0, Lgc/d;

    .line 53
    .line 54
    invoke-direct {v0, p0}, Lgc/d;-><init>(Lgc/c;)V

    .line 55
    .line 56
    .line 57
    const-string v1, "NotificationsChannelsProvider"

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Lgc/a;->s(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Lgc/a;->u()Lgc/e;

    .line 63
    .line 64
    .line 65
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    invoke-static {}, LX3/a;->f()V

    .line 67
    .line 68
    .line 69
    return-object v0

    .line 70
    :catchall_0
    move-exception v0

    .line 71
    invoke-static {}, LX3/a;->f()V

    .line 72
    .line 73
    .line 74
    throw v0
.end method
