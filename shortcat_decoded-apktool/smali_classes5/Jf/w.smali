.class final LJf/w;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LJf/I;
.implements LJf/e;
.implements LKf/m;


# instance fields
.field private final synthetic a:LJf/I;

.field private final b:LGf/C0;


# direct methods
.method public constructor <init>(LJf/I;LGf/C0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LJf/w;->a:LJf/I;

    .line 5
    .line 6
    iput-object p2, p0, LJf/w;->b:LGf/C0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(LZd/i;ILIf/a;)LJf/e;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, LJf/K;->d(LJf/I;LZd/i;ILIf/a;)LJf/e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public collect(LJf/f;LZd/e;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LJf/w;->a:LJf/I;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, LJf/y;->collect(LJf/f;LZd/e;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public getValue()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LJf/w;->a:LJf/I;

    .line 2
    .line 3
    invoke-interface {v0}, LJf/I;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
