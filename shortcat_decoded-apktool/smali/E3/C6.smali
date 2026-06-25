.class public final synthetic LE3/C6;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lt2/n;


# instance fields
.field public final synthetic a:LE3/I3;

.field public final synthetic b:LE3/h3$g;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(LE3/I3;LE3/h3$g;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LE3/C6;->a:LE3/I3;

    .line 5
    .line 6
    iput-object p2, p0, LE3/C6;->b:LE3/h3$g;

    .line 7
    .line 8
    iput p3, p0, LE3/C6;->c:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-object v0, p0, LE3/C6;->a:LE3/I3;

    .line 2
    .line 3
    iget-object v1, p0, LE3/C6;->b:LE3/h3$g;

    .line 4
    .line 5
    iget v2, p0, LE3/C6;->c:I

    .line 6
    .line 7
    check-cast p1, Lcom/google/common/util/concurrent/p;

    .line 8
    .line 9
    invoke-static {v0, v1, v2, p1}, LE3/I6;->n4(LE3/I3;LE3/h3$g;ILcom/google/common/util/concurrent/p;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
