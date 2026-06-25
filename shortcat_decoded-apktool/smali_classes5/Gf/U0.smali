.class final LGf/U0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final a:LGf/K;

.field private final b:LGf/n;


# direct methods
.method public constructor <init>(LGf/K;LGf/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LGf/U0;->a:LGf/K;

    .line 5
    .line 6
    iput-object p2, p0, LGf/U0;->b:LGf/n;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, LGf/U0;->b:LGf/n;

    .line 2
    .line 3
    iget-object v1, p0, LGf/U0;->a:LGf/K;

    .line 4
    .line 5
    sget-object v2, LTd/L;->a:LTd/L;

    .line 6
    .line 7
    invoke-interface {v0, v1, v2}, LGf/n;->N(LGf/K;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
