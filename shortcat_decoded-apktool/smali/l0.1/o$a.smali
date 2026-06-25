.class final Ll0/o$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll0/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:LGf/C0;

.field private final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LGf/C0;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ll0/o$a;->a:LGf/C0;

    .line 5
    .line 6
    iput-object p2, p0, Ll0/o$a;->b:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()LGf/C0;
    .locals 1

    .line 1
    iget-object v0, p0, Ll0/o$a;->a:LGf/C0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Ll0/o$a;->b:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method
