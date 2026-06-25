.class public final Lxe/a;
.super Ljf/f;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxe/a$a;
    }
.end annotation


# static fields
.field public static final e:Lxe/a$a;

.field private static final f:LXe/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lxe/a$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lxe/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lxe/a;->e:Lxe/a$a;

    .line 8
    .line 9
    const-string v0, "clone"

    .line 10
    .line 11
    invoke-static {v0}, LXe/f;->m(Ljava/lang/String;)LXe/f;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "identifier(...)"

    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lxe/a;->f:LXe/f;

    .line 21
    .line 22
    return-void
.end method

.method public constructor <init>(Lpf/n;Lye/e;)V
    .locals 1

    .line 1
    const-string v0, "storageManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "containingClass"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1, p2}, Ljf/f;-><init>(Lpf/n;Lye/e;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public static final synthetic n()LXe/f;
    .locals 1

    .line 1
    sget-object v0, Lxe/a;->f:LXe/f;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method protected j()Ljava/util/List;
    .locals 14

    .line 1
    invoke-virtual {p0}, Ljf/f;->m()Lye/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lze/h;->k0:Lze/h$a;

    .line 6
    .line 7
    invoke-virtual {v1}, Lze/h$a;->b()Lze/h;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    sget-object v2, Lxe/a;->f:LXe/f;

    .line 12
    .line 13
    sget-object v3, Lye/b$a;->a:Lye/b$a;

    .line 14
    .line 15
    sget-object v4, Lye/h0;->a:Lye/h0;

    .line 16
    .line 17
    invoke-static {v0, v1, v2, v3, v4}, LBe/O;->l1(Lye/m;Lze/h;LXe/f;Lye/b$a;Lye/h0;)LBe/O;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    invoke-virtual {p0}, Ljf/f;->m()Lye/e;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {v0}, Lye/e;->J0()Lye/c0;

    .line 26
    .line 27
    .line 28
    move-result-object v7

    .line 29
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v8

    .line 33
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v9

    .line 37
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object v10

    .line 41
    invoke-virtual {p0}, Ljf/f;->m()Lye/e;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {v0}, Lff/e;->m(Lye/m;)Lve/i;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {v0}, Lve/i;->i()Lqf/d0;

    .line 50
    .line 51
    .line 52
    move-result-object v11

    .line 53
    sget-object v12, Lye/E;->d:Lye/E;

    .line 54
    .line 55
    sget-object v13, Lye/t;->c:Lye/u;

    .line 56
    .line 57
    const/4 v6, 0x0

    .line 58
    invoke-virtual/range {v5 .. v13}, LBe/O;->n1(Lye/c0;Lye/c0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lqf/S;Lye/E;Lye/u;)LBe/O;

    .line 59
    .line 60
    .line 61
    invoke-static {v5}, LUd/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    return-object v0
.end method
