.class public final LK/h0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LI0/H;


# instance fields
.field private final b:LK/i0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(LK/i0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LK/h0;->b:LK/i0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()LK/i0;
    .locals 1

    .line 1
    iget-object v0, p0, LK/h0;->b:LK/i0;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic b(Li1/d;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LK/h0;->c(Li1/d;Ljava/lang/Object;)LK/h0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public c(Li1/d;Ljava/lang/Object;)LK/h0;
    .locals 0

    .line 1
    return-object p0
.end method
