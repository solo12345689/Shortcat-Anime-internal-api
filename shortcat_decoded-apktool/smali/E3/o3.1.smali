.class public final synthetic LE3/o3;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:LE3/I3;

.field public final synthetic b:Z

.field public final synthetic c:LE3/h3$g;

.field public final synthetic d:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(LE3/I3;ZLE3/h3$g;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LE3/o3;->a:LE3/I3;

    .line 5
    .line 6
    iput-boolean p2, p0, LE3/o3;->b:Z

    .line 7
    .line 8
    iput-object p3, p0, LE3/o3;->c:LE3/h3$g;

    .line 9
    .line 10
    iput-object p4, p0, LE3/o3;->d:Ljava/lang/Runnable;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, LE3/o3;->a:LE3/I3;

    .line 2
    .line 3
    iget-boolean v1, p0, LE3/o3;->b:Z

    .line 4
    .line 5
    iget-object v2, p0, LE3/o3;->c:LE3/h3$g;

    .line 6
    .line 7
    iget-object v3, p0, LE3/o3;->d:Ljava/lang/Runnable;

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3}, LE3/I3;->f(LE3/I3;ZLE3/h3$g;Ljava/lang/Runnable;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
