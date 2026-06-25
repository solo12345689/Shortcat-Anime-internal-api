.class public final Ldg/D$a$b;
.super Ldg/D;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldg/D$a;->f(Ltg/k;Ldg/x;)Ldg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic b:Ldg/x;

.field final synthetic c:Ltg/k;


# direct methods
.method constructor <init>(Ldg/x;Ltg/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldg/D$a$b;->b:Ldg/x;

    .line 2
    .line 3
    iput-object p2, p0, Ldg/D$a$b;->c:Ltg/k;

    .line 4
    .line 5
    invoke-direct {p0}, Ldg/D;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    .line 1
    iget-object v0, p0, Ldg/D$a$b;->c:Ltg/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Ltg/k;->K()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    int-to-long v0, v0

    .line 8
    return-wide v0
.end method

.method public b()Ldg/x;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/D$a$b;->b:Ldg/x;

    .line 2
    .line 3
    return-object v0
.end method

.method public f(Ltg/i;)V
    .locals 1

    .line 1
    const-string v0, "sink"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ldg/D$a$b;->c:Ltg/k;

    .line 7
    .line 8
    invoke-interface {p1, v0}, Ltg/i;->A0(Ltg/k;)Ltg/i;

    .line 9
    .line 10
    .line 11
    return-void
.end method
