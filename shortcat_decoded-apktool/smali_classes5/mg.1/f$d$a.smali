.class public final Lmg/f$d$a;
.super Lig/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmg/f$d;->p(ZLmg/m;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic e:Lmg/f;

.field final synthetic f:Lkotlin/jvm/internal/N;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLmg/f;Lkotlin/jvm/internal/N;)V
    .locals 0

    .line 1
    iput-object p3, p0, Lmg/f$d$a;->e:Lmg/f;

    .line 2
    .line 3
    iput-object p4, p0, Lmg/f$d$a;->f:Lkotlin/jvm/internal/N;

    .line 4
    .line 5
    invoke-direct {p0, p1, p2}, Lig/a;-><init>(Ljava/lang/String;Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public f()J
    .locals 3

    .line 1
    iget-object v0, p0, Lmg/f$d$a;->e:Lmg/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Lmg/f;->B0()Lmg/f$c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lmg/f$d$a;->e:Lmg/f;

    .line 8
    .line 9
    iget-object v2, p0, Lmg/f$d$a;->f:Lkotlin/jvm/internal/N;

    .line 10
    .line 11
    iget-object v2, v2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, Lmg/m;

    .line 14
    .line 15
    invoke-virtual {v0, v1, v2}, Lmg/f$c;->a(Lmg/f;Lmg/m;)V

    .line 16
    .line 17
    .line 18
    const-wide/16 v0, -0x1

    .line 19
    .line 20
    return-wide v0
.end method
