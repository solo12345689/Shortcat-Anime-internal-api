.class public final synthetic LE3/E6;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:LE3/I3;

.field public final synthetic b:LE3/I6$d;

.field public final synthetic c:LE3/h3$i;


# direct methods
.method public synthetic constructor <init>(LE3/I3;LE3/I6$d;LE3/h3$i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LE3/E6;->a:LE3/I3;

    .line 5
    .line 6
    iput-object p2, p0, LE3/E6;->b:LE3/I6$d;

    .line 7
    .line 8
    iput-object p3, p0, LE3/E6;->c:LE3/h3$i;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, LE3/E6;->a:LE3/I3;

    .line 2
    .line 3
    iget-object v1, p0, LE3/E6;->b:LE3/I6$d;

    .line 4
    .line 5
    iget-object v2, p0, LE3/E6;->c:LE3/h3$i;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, LE3/I6;->Q3(LE3/I3;LE3/I6$d;LE3/h3$i;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
