.class public final LPc/i;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LOc/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LPc/i$a;
    }
.end annotation


# static fields
.field public static final CREATOR:LPc/i$a;


# instance fields
.field private final a:Lcom/google/firebase/messaging/W;

.field private final b:Ljava/util/Map;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Z

.field private final f:Ljava/lang/String;

.field private final g:[J

.field private final h:Lorg/json/JSONObject;

.field private final i:Z

.field private final j:Z

.field private final k:Ljava/lang/String;

.field private final l:Z

.field private final m:Ljava/lang/String;

.field private final n:Ljava/lang/Integer;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LPc/i$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LPc/i$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LPc/i;->CREATOR:LPc/i$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    const-class v0, Lcom/google/firebase/messaging/W;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    check-cast p1, Lcom/google/firebase/messaging/W;

    invoke-direct {p0, p1}, LPc/i;-><init>(Lcom/google/firebase/messaging/W;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/firebase/messaging/W;)V
    .locals 4

    const-string v0, "remoteMessage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LPc/i;->a:Lcom/google/firebase/messaging/W;

    .line 2
    invoke-virtual {p1}, Lcom/google/firebase/messaging/W;->d()Ljava/util/Map;

    move-result-object v0

    const-string v1, "getData(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, LPc/f;->a(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, LPc/i;->b:Ljava/util/Map;

    .line 3
    invoke-virtual {p1}, Lcom/google/firebase/messaging/W;->r()Lcom/google/firebase/messaging/W$c;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/google/firebase/messaging/W$c;->w()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    invoke-static {v0}, LPc/f;->l(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v1

    :cond_1
    iput-object v1, p0, LPc/i;->c:Ljava/lang/String;

    .line 4
    invoke-virtual {p1}, Lcom/google/firebase/messaging/W;->r()Lcom/google/firebase/messaging/W$c;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/google/firebase/messaging/W$c;->a()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_3

    :cond_2
    invoke-static {v0}, LPc/f;->g(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v1

    :cond_3
    iput-object v1, p0, LPc/i;->d:Ljava/lang/String;

    .line 5
    invoke-virtual {p1}, Lcom/google/firebase/messaging/W;->r()Lcom/google/firebase/messaging/W$c;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lcom/google/firebase/messaging/W$c;->s()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_4
    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_5

    invoke-static {v0}, LPc/f;->h(Ljava/util/Map;)Z

    move-result v1

    if-eqz v1, :cond_5

    move v1, v3

    goto :goto_1

    :cond_5
    move v1, v2

    :goto_1
    iput-boolean v1, p0, LPc/i;->e:Z

    .line 6
    invoke-virtual {p1}, Lcom/google/firebase/messaging/W;->r()Lcom/google/firebase/messaging/W$c;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Lcom/google/firebase/messaging/W$c;->s()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_7

    :cond_6
    invoke-static {v0}, LPc/f;->j(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v1

    :cond_7
    iput-object v1, p0, LPc/i;->f:Ljava/lang/String;

    .line 7
    invoke-virtual {p1}, Lcom/google/firebase/messaging/W;->r()Lcom/google/firebase/messaging/W$c;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-virtual {v1}, Lcom/google/firebase/messaging/W$c;->z()[J

    move-result-object v1

    if-nez v1, :cond_9

    :cond_8
    invoke-static {v0}, LPc/f;->m(Ljava/util/Map;)[J

    move-result-object v1

    :cond_9
    iput-object v1, p0, LPc/i;->g:[J

    .line 8
    invoke-static {v0}, LPc/f;->d(Ljava/util/Map;)Lorg/json/JSONObject;

    move-result-object v1

    iput-object v1, p0, LPc/i;->h:Lorg/json/JSONObject;

    .line 9
    invoke-static {v0}, LPc/f;->b(Ljava/util/Map;)Z

    move-result v1

    iput-boolean v1, p0, LPc/i;->i:Z

    .line 10
    invoke-virtual {p1}, Lcom/google/firebase/messaging/W;->r()Lcom/google/firebase/messaging/W$c;

    move-result-object p1

    if-nez p1, :cond_a

    move v2, v3

    :cond_a
    iput-boolean v2, p0, LPc/i;->j:Z

    .line 11
    invoke-static {v0}, LPc/f;->e(Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LPc/i;->k:Ljava/lang/String;

    .line 12
    invoke-static {v0}, LPc/f;->n(Ljava/util/Map;)Z

    move-result p1

    iput-boolean p1, p0, LPc/i;->l:Z

    .line 13
    invoke-static {v0}, LPc/f;->k(Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LPc/i;->m:Ljava/lang/String;

    .line 14
    invoke-static {v0}, LPc/f;->c(Ljava/util/Map;)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, LPc/i;->n:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public D()LMc/d;
    .locals 2

    .line 1
    iget-object v0, p0, LPc/i;->a:Lcom/google/firebase/messaging/W;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/firebase/messaging/W;->w()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    sget-object v0, LMc/d;->f:LMc/d;

    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    sget-object v0, LMc/d;->e:LMc/d;

    .line 14
    .line 15
    return-object v0
.end method

.method public F()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LPc/i;->i:Z

    .line 2
    .line 3
    return v0
.end method

.method public G()[J
    .locals 1

    .line 1
    iget-object v0, p0, LPc/i;->g:[J

    .line 2
    .line 3
    return-object v0
.end method

.method public I()Ljava/lang/Number;
    .locals 1

    .line 1
    iget-object v0, p0, LPc/i;->a:Lcom/google/firebase/messaging/W;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/firebase/messaging/W;->r()Lcom/google/firebase/messaging/W$c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/google/firebase/messaging/W$c;->f()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, LPc/i;->b:Ljava/util/Map;

    .line 16
    .line 17
    invoke-static {v0}, LPc/f;->f(Ljava/util/Map;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :cond_1
    if-eqz v0, :cond_2

    .line 22
    .line 23
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    return-object v0

    .line 32
    :cond_2
    const/4 v0, 0x0

    .line 33
    return-object v0
.end method

.method public K()Z
    .locals 1

    .line 1
    iget-object v0, p0, LPc/i;->a:Lcom/google/firebase/messaging/W;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/firebase/messaging/W;->r()Lcom/google/firebase/messaging/W$c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/google/firebase/messaging/W$c;->i()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0

    .line 14
    :cond_0
    iget-object v0, p0, LPc/i;->b:Ljava/util/Map;

    .line 15
    .line 16
    invoke-static {v0}, LPc/f;->i(Ljava/util/Map;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    return v0
.end method

.method public L()Z
    .locals 1

    .line 1
    iget-object v0, p0, LPc/i;->a:Lcom/google/firebase/messaging/W;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/firebase/messaging/W;->r()Lcom/google/firebase/messaging/W$c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/google/firebase/messaging/W$c;->l()Landroid/net/Uri;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    if-eqz v0, :cond_1

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_1
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method public M(Landroid/content/Context;LZd/e;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object p1, p0, LPc/i;->a:Lcom/google/firebase/messaging/W;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/google/firebase/messaging/W;->r()Lcom/google/firebase/messaging/W$c;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/google/firebase/messaging/W$c;->l()Landroid/net/Uri;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    move-object v1, p1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object v1, v0

    .line 17
    :goto_0
    if-eqz v1, :cond_2

    .line 18
    .line 19
    const/4 v7, 0x6

    .line 20
    const/4 v8, 0x0

    .line 21
    const-wide/16 v2, 0x0

    .line 22
    .line 23
    const-wide/16 v4, 0x0

    .line 24
    .line 25
    move-object v6, p2

    .line 26
    invoke-static/range {v1 .. v8}, LSc/b;->b(Landroid/net/Uri;JJLZd/e;ILjava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    if-ne p1, p2, :cond_1

    .line 35
    .line 36
    return-object p1

    .line 37
    :cond_1
    check-cast p1, Landroid/graphics/Bitmap;

    .line 38
    .line 39
    return-object p1

    .line 40
    :cond_2
    return-object v0
.end method

.method public N()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LPc/i;->e:Z

    .line 2
    .line 3
    return v0
.end method

.method public P()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LPc/i;->f:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public Q()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LPc/i;->k:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public R()Lorg/json/JSONObject;
    .locals 1

    .line 1
    iget-object v0, p0, LPc/i;->h:Lorg/json/JSONObject;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic T()Ljava/lang/Number;
    .locals 1

    .line 1
    invoke-virtual {p0}, LPc/i;->a()Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public U()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LPc/i;->l:Z

    .line 2
    .line 3
    return v0
.end method

.method public V()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LPc/i;->m:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public a()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, LPc/i;->n:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LPc/i;->j:Z

    .line 2
    .line 3
    return v0
.end method

.method public describeContents()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public getText()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LPc/i;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LPc/i;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 1
    const-string v0, "dest"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LPc/i;->a:Lcom/google/firebase/messaging/W;

    .line 7
    .line 8
    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
