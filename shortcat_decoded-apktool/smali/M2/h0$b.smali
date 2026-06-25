.class public final LM2/h0$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LM2/h0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Lw2/g$a;

.field private b:LQ2/k;

.field private c:Z

.field private d:Ljava/lang/Object;

.field private e:Ljava/lang/String;

.field private f:LO9/t;


# direct methods
.method public constructor <init>(Lw2/g$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Lw2/g$a;

    .line 9
    .line 10
    iput-object p1, p0, LM2/h0$b;->a:Lw2/g$a;

    .line 11
    .line 12
    new-instance p1, LQ2/j;

    .line 13
    .line 14
    invoke-direct {p1}, LQ2/j;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, LM2/h0$b;->b:LQ2/k;

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    iput-boolean p1, p0, LM2/h0$b;->c:Z

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public a(Lq2/C$k;J)LM2/h0;
    .locals 11

    .line 1
    new-instance v0, LM2/h0;

    .line 2
    .line 3
    iget-object v1, p0, LM2/h0$b;->e:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v3, p0, LM2/h0$b;->a:Lw2/g$a;

    .line 6
    .line 7
    iget-object v6, p0, LM2/h0$b;->b:LQ2/k;

    .line 8
    .line 9
    iget-boolean v7, p0, LM2/h0$b;->c:Z

    .line 10
    .line 11
    iget-object v8, p0, LM2/h0$b;->d:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v9, p0, LM2/h0$b;->f:LO9/t;

    .line 14
    .line 15
    const/4 v10, 0x0

    .line 16
    move-object v2, p1

    .line 17
    move-wide v4, p2

    .line 18
    invoke-direct/range {v0 .. v10}, LM2/h0;-><init>(Ljava/lang/String;Lq2/C$k;Lw2/g$a;JLQ2/k;ZLjava/lang/Object;LO9/t;LM2/h0$a;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public b(LQ2/k;)LM2/h0$b;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    new-instance p1, LQ2/j;

    .line 5
    .line 6
    invoke-direct {p1}, LQ2/j;-><init>()V

    .line 7
    .line 8
    .line 9
    :goto_0
    iput-object p1, p0, LM2/h0$b;->b:LQ2/k;

    .line 10
    .line 11
    return-object p0
.end method
