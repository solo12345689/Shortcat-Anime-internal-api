.class public final Lmg/f$d$c;
.super Lig/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmg/f$d;->k(ZII)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic e:Lmg/f;

.field final synthetic f:I

.field final synthetic g:I


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLmg/f;II)V
    .locals 0

    .line 1
    iput-object p3, p0, Lmg/f$d$c;->e:Lmg/f;

    .line 2
    .line 3
    iput p4, p0, Lmg/f$d$c;->f:I

    .line 4
    .line 5
    iput p5, p0, Lmg/f$d$c;->g:I

    .line 6
    .line 7
    invoke-direct {p0, p1, p2}, Lig/a;-><init>(Ljava/lang/String;Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public f()J
    .locals 4

    .line 1
    iget-object v0, p0, Lmg/f$d$c;->e:Lmg/f;

    .line 2
    .line 3
    iget v1, p0, Lmg/f$d$c;->f:I

    .line 4
    .line 5
    iget v2, p0, Lmg/f$d$c;->g:I

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    invoke-virtual {v0, v3, v1, v2}, Lmg/f;->l2(ZII)V

    .line 9
    .line 10
    .line 11
    const-wide/16 v0, -0x1

    .line 12
    .line 13
    return-wide v0
.end method
