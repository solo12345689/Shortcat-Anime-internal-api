.class public final LCf/v$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Iterable;
.implements Lje/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LCf/v;->u(LCf/i;)Ljava/lang/Iterable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LCf/i;


# direct methods
.method public constructor <init>(LCf/i;)V
    .locals 0

    .line 1
    iput-object p1, p0, LCf/v$a;->a:LCf/i;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    iget-object v0, p0, LCf/v$a;->a:LCf/i;

    .line 2
    .line 3
    invoke-interface {v0}, LCf/i;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
