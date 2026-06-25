.class public LWh/k;
.super LWh/j;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:LYh/s;

.field private final b:LWh/l;


# direct methods
.method constructor <init>(LYh/s;LWh/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LWh/j;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LWh/k;->a:LYh/s;

    .line 5
    .line 6
    iput-object p2, p0, LWh/k;->b:LWh/l;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public c()LYh/s;
    .locals 1

    .line 1
    iget-object v0, p0, LWh/k;->a:LYh/s;

    .line 2
    .line 3
    return-object v0
.end method

.method public d()LWh/l;
    .locals 1

    .line 1
    iget-object v0, p0, LWh/k;->b:LWh/l;

    .line 2
    .line 3
    return-object v0
.end method
