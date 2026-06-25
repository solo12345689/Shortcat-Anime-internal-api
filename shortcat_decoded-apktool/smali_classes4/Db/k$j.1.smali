.class public final LDb/k$j;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LDb/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LDb/k;->n()Lgc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private a:J

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:LDb/k;


# direct methods
.method constructor <init>(Ljava/lang/String;LDb/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, LDb/k$j;->b:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, LDb/k$j;->c:LDb/k;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    const-wide/16 p1, -0x1

    .line 9
    .line 10
    iput-wide p1, p0, LDb/k$j;->a:J

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public a(JJ)V
    .locals 8

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Landroid/os/Bundle;

    .line 7
    .line 8
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 12
    .line 13
    .line 14
    move-result-wide v2

    .line 15
    iget-wide v4, p0, LDb/k$j;->a:J

    .line 16
    .line 17
    const-wide/16 v6, 0x64

    .line 18
    .line 19
    add-long/2addr v4, v6

    .line 20
    cmp-long v4, v2, v4

    .line 21
    .line 22
    if-gtz v4, :cond_1

    .line 23
    .line 24
    cmp-long v4, p1, p3

    .line 25
    .line 26
    if-nez v4, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return-void

    .line 30
    :cond_1
    :goto_0
    iput-wide v2, p0, LDb/k$j;->a:J

    .line 31
    .line 32
    const-string v2, "totalBytesSent"

    .line 33
    .line 34
    long-to-double p1, p1

    .line 35
    invoke-virtual {v1, v2, p1, p2}, Landroid/os/BaseBundle;->putDouble(Ljava/lang/String;D)V

    .line 36
    .line 37
    .line 38
    const-string p1, "totalBytesExpectedToSend"

    .line 39
    .line 40
    long-to-double p2, p3

    .line 41
    invoke-virtual {v1, p1, p2, p3}, Landroid/os/BaseBundle;->putDouble(Ljava/lang/String;D)V

    .line 42
    .line 43
    .line 44
    const-string p1, "uuid"

    .line 45
    .line 46
    iget-object p2, p0, LDb/k$j;->b:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {v0, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const-string p1, "data"

    .line 52
    .line 53
    invoke-virtual {v0, p1, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 54
    .line 55
    .line 56
    iget-object p1, p0, LDb/k$j;->c:LDb/k;

    .line 57
    .line 58
    const-string p2, "expo-file-system.uploadProgress"

    .line 59
    .line 60
    invoke-virtual {p1, p2, v0}, Lgc/c;->s(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method
