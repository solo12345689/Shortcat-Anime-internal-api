.class public final synthetic Ly8/q;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LA8/b$a;


# instance fields
.field public final synthetic a:Ly8/r;

.field public final synthetic b:Lr8/o;

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Ly8/r;Lr8/o;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly8/q;->a:Ly8/r;

    .line 5
    .line 6
    iput-object p2, p0, Ly8/q;->b:Lr8/o;

    .line 7
    .line 8
    iput-wide p3, p0, Ly8/q;->c:J

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Ly8/q;->a:Ly8/r;

    .line 2
    .line 3
    iget-object v1, p0, Ly8/q;->b:Lr8/o;

    .line 4
    .line 5
    iget-wide v2, p0, Ly8/q;->c:J

    .line 6
    .line 7
    invoke-static {v0, v1, v2, v3}, Ly8/r;->g(Ly8/r;Lr8/o;J)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method
