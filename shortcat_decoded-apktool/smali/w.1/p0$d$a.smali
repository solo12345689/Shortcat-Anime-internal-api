.class public final Lw/p0$d$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LY/X;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw/p0$d;->invoke(LY/Y;)LY/X;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lw/o0;

.field final synthetic b:Lw/o0$a;


# direct methods
.method public constructor <init>(Lw/o0;Lw/o0$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw/p0$d$a;->a:Lw/o0;

    .line 2
    .line 3
    iput-object p2, p0, Lw/p0$d$a;->b:Lw/o0$a;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 2

    .line 1
    iget-object v0, p0, Lw/p0$d$a;->a:Lw/o0;

    .line 2
    .line 3
    iget-object v1, p0, Lw/p0$d$a;->b:Lw/o0$a;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lw/o0;->z(Lw/o0$a;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
