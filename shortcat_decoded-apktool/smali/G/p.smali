.class final LG/p;
.super LF/m;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Lie/p;

.field private final b:Lkotlin/jvm/functions/Function1;

.field private final c:I

.field private final d:LF/d;


# direct methods
.method public constructor <init>(Lie/p;Lkotlin/jvm/functions/Function1;I)V
    .locals 2

    .line 1
    invoke-direct {p0}, LF/m;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LG/p;->a:Lie/p;

    .line 5
    .line 6
    iput-object p2, p0, LG/p;->b:Lkotlin/jvm/functions/Function1;

    .line 7
    .line 8
    iput p3, p0, LG/p;->c:I

    .line 9
    .line 10
    new-instance v0, LF/G;

    .line 11
    .line 12
    invoke-direct {v0}, LF/G;-><init>()V

    .line 13
    .line 14
    .line 15
    new-instance v1, LG/l;

    .line 16
    .line 17
    invoke-direct {v1, p2, p1}, LG/l;-><init>(Lkotlin/jvm/functions/Function1;Lie/p;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p3, v1}, LF/G;->b(ILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, LG/p;->d:LF/d;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public g()LF/d;
    .locals 1

    .line 1
    iget-object v0, p0, LG/p;->d:LF/d;

    .line 2
    .line 3
    return-object v0
.end method
