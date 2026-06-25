.class final LD0/c$b;
.super Lkotlin/coroutines/jvm/internal/d;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD0/c;->R0(JLZd/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:J

.field synthetic b:Ljava/lang/Object;

.field final synthetic c:LD0/c;

.field d:I


# direct methods
.method constructor <init>(LD0/c;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, LD0/c$b;->c:LD0/c;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(LZd/e;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iput-object p1, p0, LD0/c$b;->b:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, LD0/c$b;->d:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, LD0/c$b;->d:I

    .line 9
    .line 10
    iget-object p1, p0, LD0/c$b;->c:LD0/c;

    .line 11
    .line 12
    const-wide/16 v0, 0x0

    .line 13
    .line 14
    invoke-virtual {p1, v0, v1, p0}, LD0/c;->R0(JLZd/e;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method
