.class public final synthetic LE3/u6;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LE3/I6$e;


# instance fields
.field public final synthetic a:LE3/I6$e;

.field public final synthetic b:LE3/I6$c;


# direct methods
.method public synthetic constructor <init>(LE3/I6$e;LE3/I6$c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LE3/u6;->a:LE3/I6$e;

    .line 5
    .line 6
    iput-object p2, p0, LE3/u6;->b:LE3/I6$c;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(LE3/I3;LE3/h3$g;I)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LE3/u6;->a:LE3/I6$e;

    .line 2
    .line 3
    iget-object v1, p0, LE3/u6;->b:LE3/I6$c;

    .line 4
    .line 5
    invoke-static {v0, v1, p1, p2, p3}, LE3/I6;->e4(LE3/I6$e;LE3/I6$c;LE3/I3;LE3/h3$g;I)Lcom/google/common/util/concurrent/p;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
