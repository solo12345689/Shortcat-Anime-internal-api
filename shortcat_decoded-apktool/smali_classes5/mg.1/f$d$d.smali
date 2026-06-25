.class public final Lmg/f$d$d;
.super Lig/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmg/f$d;->j(ZLmg/m;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic e:Lmg/f$d;

.field final synthetic f:Z

.field final synthetic g:Lmg/m;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLmg/f$d;ZLmg/m;)V
    .locals 0

    .line 1
    iput-object p3, p0, Lmg/f$d$d;->e:Lmg/f$d;

    .line 2
    .line 3
    iput-boolean p4, p0, Lmg/f$d$d;->f:Z

    .line 4
    .line 5
    iput-object p5, p0, Lmg/f$d$d;->g:Lmg/m;

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
    .locals 3

    .line 1
    iget-object v0, p0, Lmg/f$d$d;->e:Lmg/f$d;

    .line 2
    .line 3
    iget-boolean v1, p0, Lmg/f$d$d;->f:Z

    .line 4
    .line 5
    iget-object v2, p0, Lmg/f$d$d;->g:Lmg/m;

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Lmg/f$d;->p(ZLmg/m;)V

    .line 8
    .line 9
    .line 10
    const-wide/16 v0, -0x1

    .line 11
    .line 12
    return-wide v0
.end method
