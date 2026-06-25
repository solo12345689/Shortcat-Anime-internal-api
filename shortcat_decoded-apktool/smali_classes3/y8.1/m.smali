.class public final synthetic Ly8/m;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LA8/b$a;


# instance fields
.field public final synthetic a:Ly8/r;

.field public final synthetic b:Ljava/lang/Iterable;

.field public final synthetic c:Lr8/o;

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(Ly8/r;Ljava/lang/Iterable;Lr8/o;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly8/m;->a:Ly8/r;

    .line 5
    .line 6
    iput-object p2, p0, Ly8/m;->b:Ljava/lang/Iterable;

    .line 7
    .line 8
    iput-object p3, p0, Ly8/m;->c:Lr8/o;

    .line 9
    .line 10
    iput-wide p4, p0, Ly8/m;->d:J

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Ly8/m;->a:Ly8/r;

    .line 2
    .line 3
    iget-object v1, p0, Ly8/m;->b:Ljava/lang/Iterable;

    .line 4
    .line 5
    iget-object v2, p0, Ly8/m;->c:Lr8/o;

    .line 6
    .line 7
    iget-wide v3, p0, Ly8/m;->d:J

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3, v4}, Ly8/r;->b(Ly8/r;Ljava/lang/Iterable;Lr8/o;J)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method
