.class final LGf/I0$b;
.super LGf/H0;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LGf/I0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private final e:LGf/I0;

.field private final f:LGf/I0$c;

.field private final g:LGf/v;

.field private final h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LGf/I0;LGf/I0$c;LGf/v;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LGf/H0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LGf/I0$b;->e:LGf/I0;

    .line 5
    .line 6
    iput-object p2, p0, LGf/I0$b;->f:LGf/I0$c;

    .line 7
    .line 8
    iput-object p3, p0, LGf/I0$b;->g:LGf/v;

    .line 9
    .line 10
    iput-object p4, p0, LGf/I0$b;->h:Ljava/lang/Object;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public v()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public w(Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    iget-object p1, p0, LGf/I0$b;->e:LGf/I0;

    .line 2
    .line 3
    iget-object v0, p0, LGf/I0$b;->f:LGf/I0$c;

    .line 4
    .line 5
    iget-object v1, p0, LGf/I0$b;->g:LGf/v;

    .line 6
    .line 7
    iget-object v2, p0, LGf/I0$b;->h:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-static {p1, v0, v1, v2}, LGf/I0;->r(LGf/I0;LGf/I0$c;LGf/v;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
