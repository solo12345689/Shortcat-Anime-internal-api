.class public final LGf/i1;
.super LZd/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LGf/i1$a;
    }
.end annotation


# static fields
.field public static final c:LGf/i1$a;


# instance fields
.field public b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LGf/i1$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LGf/i1$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LGf/i1;->c:LGf/i1$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, LGf/i1;->c:LGf/i1$a;

    .line 2
    .line 3
    invoke-direct {p0, v0}, LZd/a;-><init>(LZd/i$c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
