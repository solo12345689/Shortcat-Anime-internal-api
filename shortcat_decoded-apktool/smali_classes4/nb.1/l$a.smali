.class final Lnb/l$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnb/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field private a:Z

.field private b:J

.field private final c:Landroid/content/ClipboardManager$OnPrimaryClipChangedListener;

.field private final d:Landroid/content/ClipboardManager;

.field final synthetic e:Lnb/l;


# direct methods
.method public constructor <init>(Lnb/l;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lnb/l$a;->e:Lnb/l;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lnb/l$a;->a:Z

    .line 8
    .line 9
    const-wide/16 v0, -0x1

    .line 10
    .line 11
    iput-wide v0, p0, Lnb/l$a;->b:J

    .line 12
    .line 13
    new-instance v0, Lnb/k;

    .line 14
    .line 15
    invoke-direct {v0, p1, p0}, Lnb/k;-><init>(Lnb/l;Lnb/l$a;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lnb/l$a;->c:Landroid/content/ClipboardManager$OnPrimaryClipChangedListener;

    .line 19
    .line 20
    :try_start_0
    sget-object v0, LTd/u;->b:LTd/u$a;

    .line 21
    .line 22
    invoke-static {p1}, Lnb/l;->B(Lnb/l;)Landroid/content/ClipboardManager;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {p1}, LTd/u;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception p1

    .line 32
    sget-object v0, LTd/u;->b:LTd/u$a;

    .line 33
    .line 34
    invoke-static {p1}, LTd/v;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-static {p1}, LTd/u;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    :goto_0
    invoke-static {p1}, LTd/u;->g(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_0

    .line 47
    .line 48
    const/4 p1, 0x0

    .line 49
    :cond_0
    check-cast p1, Landroid/content/ClipboardManager;

    .line 50
    .line 51
    iput-object p1, p0, Lnb/l$a;->d:Landroid/content/ClipboardManager;

    .line 52
    .line 53
    return-void
.end method

.method public static synthetic a(Lnb/l;Lnb/l$a;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lnb/l$a;->d(Lnb/l;Lnb/l$a;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final d(Lnb/l;Lnb/l$a;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lgc/c;->i()LUb/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LUb/d;->t()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto/16 :goto_4

    .line 12
    .line 13
    :cond_0
    iget-object v0, p1, Lnb/l$a;->d:Landroid/content/ClipboardManager;

    .line 14
    .line 15
    iget-boolean v1, p1, Lnb/l$a;->a:Z

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    move-object v0, v2

    .line 22
    :goto_0
    if-eqz v0, :cond_8

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/content/ClipboardManager;->getPrimaryClipDescription()Landroid/content/ClipDescription;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-eqz v0, :cond_8

    .line 29
    .line 30
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 31
    .line 32
    const/16 v3, 0x1a

    .line 33
    .line 34
    if-lt v1, v3, :cond_3

    .line 35
    .line 36
    iget-wide v3, p1, Lnb/l$a;->b:J

    .line 37
    .line 38
    invoke-static {v0}, Lnb/j;->a(Landroid/content/ClipDescription;)J

    .line 39
    .line 40
    .line 41
    move-result-wide v5

    .line 42
    cmp-long v1, v3, v5

    .line 43
    .line 44
    if-nez v1, :cond_2

    .line 45
    .line 46
    goto :goto_4

    .line 47
    :cond_2
    invoke-static {v0}, Lnb/j;->a(Landroid/content/ClipDescription;)J

    .line 48
    .line 49
    .line 50
    move-result-wide v3

    .line 51
    iput-wide v3, p1, Lnb/l$a;->b:J

    .line 52
    .line 53
    :cond_3
    sget-object p1, Lnb/o;->b:Lnb/o;

    .line 54
    .line 55
    invoke-static {v0}, Lnb/m;->b(Landroid/content/ClipDescription;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-eqz v1, :cond_4

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_4
    move-object p1, v2

    .line 63
    :goto_1
    sget-object v1, Lnb/o;->c:Lnb/o;

    .line 64
    .line 65
    const-string v3, "text/html"

    .line 66
    .line 67
    invoke-virtual {v0, v3}, Landroid/content/ClipDescription;->hasMimeType(Ljava/lang/String;)Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-eqz v3, :cond_5

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_5
    move-object v1, v2

    .line 75
    :goto_2
    sget-object v3, Lnb/o;->d:Lnb/o;

    .line 76
    .line 77
    const-string v4, "image/*"

    .line 78
    .line 79
    invoke-virtual {v0, v4}, Landroid/content/ClipDescription;->hasMimeType(Ljava/lang/String;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_6

    .line 84
    .line 85
    move-object v2, v3

    .line 86
    :cond_6
    filled-new-array {p1, v1, v2}, [Lnb/o;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-static {p1}, LUd/u;->r([Ljava/lang/Object;)Ljava/util/List;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    new-instance v0, Ljava/util/ArrayList;

    .line 95
    .line 96
    const/16 v1, 0xa

    .line 97
    .line 98
    invoke-static {p1, v1}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 103
    .line 104
    .line 105
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    if-eqz v1, :cond_7

    .line 114
    .line 115
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    check-cast v1, Lnb/o;

    .line 120
    .line 121
    invoke-virtual {v1}, Lnb/o;->b()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_7
    const-string p1, "contentTypes"

    .line 130
    .line 131
    invoke-static {p1, v0}, LTd/z;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    filled-new-array {p1}, [Lkotlin/Pair;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-static {p1}, LG1/c;->a([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    const-string v0, "onClipboardChanged"

    .line 144
    .line 145
    invoke-virtual {p0, v0, p1}, Lgc/c;->s(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 146
    .line 147
    .line 148
    :cond_8
    :goto_4
    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lnb/l$a;->d:Landroid/content/ClipboardManager;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lnb/l$a;->c:Landroid/content/ClipboardManager$OnPrimaryClipChangedListener;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/content/ClipboardManager;->addPrimaryClipChangedListener(Landroid/content/ClipboardManager$OnPrimaryClipChangedListener;)V

    .line 8
    .line 9
    .line 10
    sget-object v0, LTd/L;->a:LTd/L;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    :goto_0
    if-nez v0, :cond_1

    .line 15
    .line 16
    invoke-static {}, Lnb/m;->c()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v1, "\'CLIPBOARD_SERVICE\' unavailable. Events won\'t be received"

    .line 21
    .line 22
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :cond_1
    return-object v0
.end method

.method public final c()LTd/L;
    .locals 2

    .line 1
    iget-object v0, p0, Lnb/l$a;->d:Landroid/content/ClipboardManager;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lnb/l$a;->c:Landroid/content/ClipboardManager$OnPrimaryClipChangedListener;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/content/ClipboardManager;->removePrimaryClipChangedListener(Landroid/content/ClipboardManager$OnPrimaryClipChangedListener;)V

    .line 8
    .line 9
    .line 10
    sget-object v0, LTd/L;->a:LTd/L;

    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return-object v0
.end method

.method public final e()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lnb/l$a;->a:Z

    .line 3
    .line 4
    return-void
.end method

.method public final f()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lnb/l$a;->a:Z

    .line 3
    .line 4
    return-void
.end method
