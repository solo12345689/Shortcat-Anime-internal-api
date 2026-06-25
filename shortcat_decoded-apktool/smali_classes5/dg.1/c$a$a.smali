.class public final Ldg/c$a$a;
.super Ltg/r;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldg/c$a;-><init>(Lhg/d$d;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic b:Ldg/c$a;


# direct methods
.method constructor <init>(Ltg/Z;Ldg/c$a;)V
    .locals 0

    .line 1
    iput-object p2, p0, Ldg/c$a$a;->b:Ldg/c$a;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Ltg/r;-><init>(Ltg/Z;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/c$a$a;->b:Ldg/c$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Ldg/c$a;->m()Lhg/d$d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lhg/d$d;->close()V

    .line 8
    .line 9
    .line 10
    invoke-super {p0}, Ltg/r;->close()V

    .line 11
    .line 12
    .line 13
    return-void
.end method
