.class public LVh/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field public final a:LYh/A;

.field public final b:LWh/l;

.field public final c:LWh/l;

.field public final d:Z

.field public final e:LVh/e;

.field public final f:LVh/f;

.field public g:Z

.field public h:Z


# direct methods
.method private constructor <init>(LYh/A;LWh/l;LWh/l;LVh/e;LVh/f;Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, LVh/e;->g:Z

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, LVh/e;->h:Z

    .line 9
    .line 10
    iput-object p1, p0, LVh/e;->a:LYh/A;

    .line 11
    .line 12
    iput-object p2, p0, LVh/e;->b:LWh/l;

    .line 13
    .line 14
    iput-object p3, p0, LVh/e;->c:LWh/l;

    .line 15
    .line 16
    iput-boolean p6, p0, LVh/e;->d:Z

    .line 17
    .line 18
    iput-object p4, p0, LVh/e;->e:LVh/e;

    .line 19
    .line 20
    iput-object p5, p0, LVh/e;->f:LVh/f;

    .line 21
    .line 22
    return-void
.end method

.method public static a(LYh/A;LWh/l;LWh/l;LVh/e;LVh/f;)LVh/e;
    .locals 7

    .line 1
    new-instance v0, LVh/e;

    .line 2
    .line 3
    const/4 v6, 0x1

    .line 4
    move-object v1, p0

    .line 5
    move-object v2, p1

    .line 6
    move-object v3, p2

    .line 7
    move-object v4, p3

    .line 8
    move-object v5, p4

    .line 9
    invoke-direct/range {v0 .. v6}, LVh/e;-><init>(LYh/A;LWh/l;LWh/l;LVh/e;LVh/f;Z)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public static b(LYh/A;LWh/l;LWh/l;LVh/e;LVh/f;)LVh/e;
    .locals 7

    .line 1
    new-instance v0, LVh/e;

    .line 2
    .line 3
    const/4 v6, 0x0

    .line 4
    move-object v1, p0

    .line 5
    move-object v2, p1

    .line 6
    move-object v3, p2

    .line 7
    move-object v4, p3

    .line 8
    move-object v5, p4

    .line 9
    invoke-direct/range {v0 .. v6}, LVh/e;-><init>(LYh/A;LWh/l;LWh/l;LVh/e;LVh/f;Z)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method
