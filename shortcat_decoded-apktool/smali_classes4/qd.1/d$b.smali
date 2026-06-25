.class public final Lqd/d$b;
.super LM3/w;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqd/d;-><init>(LM3/q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method constructor <init>(LM3/q;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LM3/w;-><init>(LM3/q;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "DELETE FROM json_data WHERE `key` = ? AND scope_key = ?;"

    .line 2
    .line 3
    return-object v0
.end method
