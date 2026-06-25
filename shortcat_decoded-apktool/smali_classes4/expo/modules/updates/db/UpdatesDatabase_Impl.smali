.class public final Lexpo/modules/updates/db/UpdatesDatabase_Impl;
.super Lexpo/modules/updates/db/UpdatesDatabase;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\n\u001a\u00020\tH\u0014\u00a2\u0006\u0004\u0008\n\u0010\u000bJ1\u0010\u0010\u001a$\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020\u000e0\r\u0012\u0012\u0012\u0010\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020\u000e0\r0\u000f0\u000cH\u0014\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u0010\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020\u00130\r0\u0012H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J1\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u000f2\u001a\u0010\u0016\u001a\u0016\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020\u00130\r\u0012\u0004\u0012\u00020\u00130\u000cH\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0011\u0010!\u001a\u0004\u0018\u00010 H\u0016\u00a2\u0006\u0004\u0008!\u0010\"R\u001a\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\u001a0#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%R\u001a\u0010(\u001a\u0008\u0012\u0004\u0012\u00020\u001d0#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010%R\u001a\u0010*\u001a\u0008\u0012\u0004\u0012\u00020 0#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008)\u0010%\u00a8\u0006+"
    }
    d2 = {
        "Lexpo/modules/updates/db/UpdatesDatabase_Impl;",
        "Lexpo/modules/updates/db/UpdatesDatabase;",
        "<init>",
        "()V",
        "LM3/f;",
        "config",
        "LS3/h;",
        "h",
        "(LM3/f;)LS3/h;",
        "Landroidx/room/c;",
        "g",
        "()Landroidx/room/c;",
        "",
        "Ljava/lang/Class;",
        "",
        "",
        "p",
        "()Ljava/util/Map;",
        "",
        "LN3/a;",
        "o",
        "()Ljava/util/Set;",
        "autoMigrationSpecs",
        "LN3/b;",
        "j",
        "(Ljava/util/Map;)Ljava/util/List;",
        "Lqd/e;",
        "Q",
        "()Lqd/e;",
        "Lqd/a;",
        "O",
        "()Lqd/a;",
        "Lqd/c;",
        "P",
        "()Lqd/c;",
        "Lkotlin/Lazy;",
        "A",
        "Lkotlin/Lazy;",
        "_updateDao",
        "B",
        "_assetDao",
        "C",
        "_jSONDataDao",
        "expo-updates_release"
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
.field private final A:Lkotlin/Lazy;

.field private final B:Lkotlin/Lazy;

.field private final C:Lkotlin/Lazy;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lexpo/modules/updates/db/UpdatesDatabase;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lpd/n;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lpd/n;-><init>(Lexpo/modules/updates/db/UpdatesDatabase_Impl;)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lexpo/modules/updates/db/UpdatesDatabase_Impl;->A:Lkotlin/Lazy;

    .line 14
    .line 15
    new-instance v0, Lpd/o;

    .line 16
    .line 17
    invoke-direct {v0, p0}, Lpd/o;-><init>(Lexpo/modules/updates/db/UpdatesDatabase_Impl;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iput-object v0, p0, Lexpo/modules/updates/db/UpdatesDatabase_Impl;->B:Lkotlin/Lazy;

    .line 25
    .line 26
    new-instance v0, Lpd/p;

    .line 27
    .line 28
    invoke-direct {v0, p0}, Lpd/p;-><init>(Lexpo/modules/updates/db/UpdatesDatabase_Impl;)V

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iput-object v0, p0, Lexpo/modules/updates/db/UpdatesDatabase_Impl;->C:Lkotlin/Lazy;

    .line 36
    .line 37
    return-void
.end method

.method public static synthetic R(Lexpo/modules/updates/db/UpdatesDatabase_Impl;)Lqd/d;
    .locals 0

    .line 1
    invoke-static {p0}, Lexpo/modules/updates/db/UpdatesDatabase_Impl;->V(Lexpo/modules/updates/db/UpdatesDatabase_Impl;)Lqd/d;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic S(Lexpo/modules/updates/db/UpdatesDatabase_Impl;)Lqd/b;
    .locals 0

    .line 1
    invoke-static {p0}, Lexpo/modules/updates/db/UpdatesDatabase_Impl;->U(Lexpo/modules/updates/db/UpdatesDatabase_Impl;)Lqd/b;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic T(Lexpo/modules/updates/db/UpdatesDatabase_Impl;)Lqd/f;
    .locals 0

    .line 1
    invoke-static {p0}, Lexpo/modules/updates/db/UpdatesDatabase_Impl;->W(Lexpo/modules/updates/db/UpdatesDatabase_Impl;)Lqd/f;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final U(Lexpo/modules/updates/db/UpdatesDatabase_Impl;)Lqd/b;
    .locals 1

    .line 1
    new-instance v0, Lqd/b;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lqd/b;-><init>(LM3/q;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private static final V(Lexpo/modules/updates/db/UpdatesDatabase_Impl;)Lqd/d;
    .locals 1

    .line 1
    new-instance v0, Lqd/d;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lqd/d;-><init>(LM3/q;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private static final W(Lexpo/modules/updates/db/UpdatesDatabase_Impl;)Lqd/f;
    .locals 1

    .line 1
    new-instance v0, Lqd/f;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lqd/f;-><init>(LM3/q;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static final synthetic X(Lexpo/modules/updates/db/UpdatesDatabase_Impl;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, LM3/q;->h:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic Y(Lexpo/modules/updates/db/UpdatesDatabase_Impl;LS3/g;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LM3/q;->u(LS3/g;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic Z(Lexpo/modules/updates/db/UpdatesDatabase_Impl;LS3/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, LM3/q;->a:LS3/g;

    .line 2
    .line 3
    return-void
.end method


# virtual methods
.method public O()Lqd/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/updates/db/UpdatesDatabase_Impl;->B:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lqd/a;

    .line 8
    .line 9
    return-object v0
.end method

.method public P()Lqd/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/updates/db/UpdatesDatabase_Impl;->C:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lqd/c;

    .line 8
    .line 9
    return-object v0
.end method

.method public Q()Lqd/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/updates/db/UpdatesDatabase_Impl;->A:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lqd/e;

    .line 8
    .line 9
    return-object v0
.end method

.method protected g()Landroidx/room/c;
    .locals 7

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v2, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-direct {v2, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Landroidx/room/c;

    .line 13
    .line 14
    const-string v3, "assets"

    .line 15
    .line 16
    const-string v4, "json_data"

    .line 17
    .line 18
    const-string v5, "updates"

    .line 19
    .line 20
    const-string v6, "updates_assets"

    .line 21
    .line 22
    filled-new-array {v5, v6, v3, v4}, [Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-direct {v1, p0, v0, v2, v3}, Landroidx/room/c;-><init>(LM3/q;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-object v1
.end method

.method protected h(LM3/f;)LS3/h;
    .locals 4

    .line 1
    const-string v0, "config"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LM3/s;

    .line 7
    .line 8
    new-instance v1, Lexpo/modules/updates/db/UpdatesDatabase_Impl$a;

    .line 9
    .line 10
    invoke-direct {v1, p0}, Lexpo/modules/updates/db/UpdatesDatabase_Impl$a;-><init>(Lexpo/modules/updates/db/UpdatesDatabase_Impl;)V

    .line 11
    .line 12
    .line 13
    const-string v2, "f2331836f27deacc936e75b3f1a360bd"

    .line 14
    .line 15
    const-string v3, "b5440ed496eaba333f58c3ce160f54f8"

    .line 16
    .line 17
    invoke-direct {v0, p1, v1, v2, v3}, LM3/s;-><init>(LM3/f;LM3/s$b;Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    sget-object v1, LS3/h$b;->f:LS3/h$b$b;

    .line 21
    .line 22
    iget-object v2, p1, LM3/f;->a:Landroid/content/Context;

    .line 23
    .line 24
    invoke-virtual {v1, v2}, LS3/h$b$b;->a(Landroid/content/Context;)LS3/h$b$a;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iget-object v2, p1, LM3/f;->b:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v1, v2}, LS3/h$b$a;->d(Ljava/lang/String;)LS3/h$b$a;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v1, v0}, LS3/h$b$a;->c(LS3/h$a;)LS3/h$b$a;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, LS3/h$b$a;->b()LS3/h$b;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iget-object p1, p1, LM3/f;->c:LS3/h$c;

    .line 43
    .line 44
    invoke-interface {p1, v0}, LS3/h$c;->a(LS3/h$b;)LS3/h;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    return-object p1
.end method

.method public j(Ljava/util/Map;)Ljava/util/List;
    .locals 1

    .line 1
    const-string v0, "autoMigrationSpecs"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    return-object p1
.end method

.method public o()Ljava/util/Set;
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method protected p()Ljava/util/Map;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lqd/f;->l:Lqd/f$j;

    .line 7
    .line 8
    invoke-virtual {v1}, Lqd/f$j;->a()Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-class v2, Lqd/e;

    .line 13
    .line 14
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    sget-object v1, Lqd/b;->l:Lqd/b$j;

    .line 18
    .line 19
    invoke-virtual {v1}, Lqd/b$j;->a()Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const-class v2, Lqd/a;

    .line 24
    .line 25
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    sget-object v1, Lqd/d;->e:Lqd/d$c;

    .line 29
    .line 30
    invoke-virtual {v1}, Lqd/d$c;->a()Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const-class v2, Lqd/c;

    .line 35
    .line 36
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    return-object v0
.end method
