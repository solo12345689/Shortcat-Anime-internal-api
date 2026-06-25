.class public final LGf/b1;
.super Ljava/util/concurrent/CancellationException;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field public final transient a:LGf/C0;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, p1, v0}, LGf/b1;-><init>(Ljava/lang/String;LGf/C0;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;LGf/C0;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 2
    iput-object p2, p0, LGf/b1;->a:LGf/C0;

    return-void
.end method
