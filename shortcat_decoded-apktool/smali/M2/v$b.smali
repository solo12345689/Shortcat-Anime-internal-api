.class public final LM2/v$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LM2/D$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LM2/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final c:J


# direct methods
.method public constructor <init>(JLM2/t;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, LM2/v$b;->c:J

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public d(LQ2/k;)LM2/D$a;
    .locals 0

    .line 1
    return-object p0
.end method

.method public bridge synthetic e(Lq2/C;)LM2/D;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LM2/v$b;->g(Lq2/C;)LM2/v;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public f(LF2/w;)LM2/D$a;
    .locals 0

    .line 1
    return-object p0
.end method

.method public g(Lq2/C;)LM2/v;
    .locals 6

    .line 1
    new-instance v0, LM2/v;

    .line 2
    .line 3
    iget-wide v2, p0, LM2/v$b;->c:J

    .line 4
    .line 5
    const/4 v4, 0x0

    .line 6
    const/4 v5, 0x0

    .line 7
    move-object v1, p1

    .line 8
    invoke-direct/range {v0 .. v5}, LM2/v;-><init>(Lq2/C;JLM2/t;LM2/v$a;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method
