.class final LE3/g$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE3/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:LE3/S6;

.field public final c:Ljava/util/Deque;

.field public d:LE3/U6;

.field public e:Lq2/P$b;

.field public f:Lq2/P$b;

.field public g:Z

.field public h:Lq2/P$b;

.field public i:Lq2/N;

.field public j:LE3/M6;


# direct methods
.method public constructor <init>(Ljava/lang/Object;LE3/S6;LE3/U6;Lq2/P$b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LE3/g$b;->a:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, LE3/g$b;->b:LE3/S6;

    .line 7
    .line 8
    iput-object p3, p0, LE3/g$b;->d:LE3/U6;

    .line 9
    .line 10
    iput-object p4, p0, LE3/g$b;->e:Lq2/P$b;

    .line 11
    .line 12
    new-instance p1, Ljava/util/ArrayDeque;

    .line 13
    .line 14
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, LE3/g$b;->c:Ljava/util/Deque;

    .line 18
    .line 19
    sget-object p1, Lq2/P$b;->b:Lq2/P$b;

    .line 20
    .line 21
    iput-object p1, p0, LE3/g$b;->h:Lq2/P$b;

    .line 22
    .line 23
    return-void
.end method
